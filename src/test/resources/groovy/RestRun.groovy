package extension.system

import com.navis.argo.ArgoEntity
import com.navis.argo.business.api.GroovyApi
import com.navis.argo.business.model.CarrierVisit
import com.navis.argo.business.xps.model.WorkAssignment
import com.navis.framework.persistence.HibernateApi
import com.navis.framework.portal.QueryUtils
import com.navis.framework.portal.query.DomainQuery
import com.navis.framework.util.ValueObject

import com.navis.inventory.InventoryEntity
import com.navis.inventory.MovesEntity
import com.navis.inventory.business.moves.WorkInstruction
import com.navis.inventory.business.units.Unit
import com.navis.inventory.business.units.UnitEquipment
import com.navis.inventory.business.units.UnitFacilityVisit

import org.codehaus.jackson.map.ObjectMapper

import java.util.concurrent.Callable
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.Future
import java.util.function.Supplier

/**
 * Invoke a web service code extension on a list of specified nodes and concatenate all responses.
 */
class RestRun extends GroovyApi {

    public void execute(Map inParams) {
        execute()
    }

    public void execute() {
        //       _bench {1.upto(10, _getLoop)}
        _bench ({1.upto(2, _postLoop)}, "post")
    }

    def _postLoop = {
        String response = doPost()
    }

    def _getLoop = {
        String response = doGet()
    }

    def _bench = { inClosure, inText, inArg=null ->
        def start, now, value
        if (inArg==null) {
            start = System.currentTimeMillis()
            value = inClosure()
            now = System.currentTimeMillis()
        } else {
            start = System.currentTimeMillis()
            value = inClosure inArg
            now = System.currentTimeMillis()
        }
        println(inText + ":" + (now-start))
        return value
    }

    public String doGet() {
        def service = "rest/name?"
        def params = ['given':'dean']
        Callable callable = new GetCallable(service, params)
        ExecutorService executor = Executors.newFixedThreadPool(10);

        // list of callable futures
        List<Future<String>> list = (1..100).collect {executor.submit(callable)}
        String responses = list.collect {inFuture -> inFuture.get()}.join(',')

        // shut down the executor service
        executor.shutdown();
        return responses
    }

    def _unitData = {
        DomainQuery dq = QueryUtils.createDomainQuery(InventoryEntity.UNIT).setDqMaxResults(100)
        List<Unit> unitList = HibernateApi.getInstance().findEntitiesByDomainQuery(dq);
        List<ValueObject> unitObjects = unitList.collect{inIt -> inIt.getValueObject()}
        List<Map<String, String>>  units = unitObjects.collect {inIt -> inIt.getFields().collectEntries {[(it.getFieldId()):inIt.getFieldAsString(it)]}}
        return units
    }

    def _workAssignments = {
        DomainQuery dq = QueryUtils.createDomainQuery(ArgoEntity.WORK_ASSIGNMENT).setDqMaxResults(100)
        List<WorkAssignment> waList = HibernateApi.getInstance().findEntitiesByDomainQuery(dq)
        List<ValueObject> waObjects = waList.collect{inIt -> inIt.getValueObject()}
        List<Map<String, String>>  was = waObjects.collect {inIt -> inIt.getFields().collectEntries {[(it.getFieldId()):inIt.getFieldAsString(it)]}}
        return was
    }

    def _workInstructions = {
        DomainQuery dq = QueryUtils.createDomainQuery(MovesEntity.WORK_INSTRUCTION).setDqMaxResults(100)
        List<WorkInstruction> wiList = HibernateApi.getInstance().findEntitiesByDomainQuery(dq)
        println("work instructions found:" + wiList.size())
        List<ValueObject> wiObjects = wiList.collect{inIt -> inIt.getValueObject()}
        List<Map<String, String>>  wis = wiObjects.collect {inIt -> inIt.getFields().collectEntries {[(it.getFieldId()):inIt.getFieldAsString(it)]}}
        return wis
    }

    def _equipmentData = {
        DomainQuery dq = QueryUtils.createDomainQuery(InventoryEntity.UNIT_EQUIPMENT).setDqMaxResults(100)
        List<UnitEquipment> ueList = HibernateApi.getInstance().findEntitiesByDomainQuery(dq);
        List<ValueObject> visitObjects = ueList.collect{inIt -> inIt.getValueObject()}
        List<Map<String, String>>  ues = visitObjects.collect {inIt -> inIt.getFields().collectEntries {[(it.getFieldId()):inIt.getFieldAsString(it)]}}
        return ues
    }

    def _ufvs = {
        DomainQuery dq = QueryUtils.createDomainQuery(InventoryEntity.UNIT_FACILITY_VISIT).setDqMaxResults(100)
        Serializable[] ufvGkeys = HibernateApi.getInstance().findPrimaryKeysByDomainQuery(dq);
        List<UnitFacilityVisit> visits = ufvGkeys.collect {inIt -> (UnitFacilityVisit) HibernateApi.getInstance().load(UnitFacilityVisit.class, inIt) }
        List<ValueObject> visitObjects = visits.collect{inIt -> inIt.getValueObject()}

        List<Map<String, String>>  maps = visitObjects.collect {inIt -> inIt.getFields().collectEntries {[(it.getFieldId()):inIt.getFieldAsString(it)]}}
        return maps
    }

    def _carrierVisits = {
        DomainQuery dq = QueryUtils.createDomainQuery(ArgoEntity.CARRIER_VISIT).setDqMaxResults(100)
        List<CarrierVisit> visits = HibernateApi.getInstance().findEntitiesByDomainQuery(dq);
        List<ValueObject> visitObjects = visits.collect{inIt -> inIt.getValueObject()}
        List<Map<String, String>>  maps = visitObjects.collect {inIt -> inIt.getFields().collectEntries {[(it.getFieldId()):inIt.getFieldAsString(it)]}}
        return maps
    }

    def _payload = {

        def ufvData = [type:"ufv", objects:_bench(_ufvs, "normalize ufvs:")]
//        def uesData = [type:"ues", objects:_bench(_equipmentData, "normalize ues:")]
//        def wasData = [type:"was", objects:_bench(_workAssignments, "normalize was:")]
        def wisData = [type:"wis", objects:_bench(_workInstructions, "normalize wis:")]
//        def unitData = [type:"unit", objects:_bench(_unitData, "normalize unit:")]
//        def cvData = [type:"cvs", objects:_bench(_carrierVisits, "normalize cvs:")]
        return _bench(_json, "test", [ufvData, wisData])

    }

    def _json = {
        return  new ObjectMapper().writeValueAsString(it)
    }


    private doPost() {
        def service = "rest/data"
        def dataMap = _payload()
        Callable callable = new PostCallable(service, dataMap)
        ExecutorService executor = Executors.newFixedThreadPool(1)
        List<Future<String>> list = (1..2).collect {executor.submit(callable)}
        List<String> responses = list.collect {inFuture -> inFuture.get()}
        executor.shutdown();
        return responses
    }


    class GetCallable implements Callable<String> {
        private final String _serverAddress
        private final String _params

        GetCallable(String inServerAddress, Map inParams) {
            _serverAddress = inServerAddress
            _params = inParams.collect{ inK, inV -> "$inK=$inV"}.join('&')
        }

        @Override
        String call() throws Exception {
            HttpURLConnection connection = new URL( "http://localhost:8280/" + _serverAddress + _params).openConnection() as HttpURLConnection
            connection.setRequestProperty( 'User-Agent', 'groovy-2.4.4' )
            connection.setRequestProperty( 'Accept', 'application/json' )
            return connection.inputStream.text
        }
    }


    class PostCallable implements Callable<String> {

        private final String _serverAddress
        private final String _payload

        PostCallable(final String inServerAddress, final String inPayload) {
            _serverAddress = inServerAddress
            _payload = inPayload
        }

        @Override
        String call() throws Exception {
            _bench(_call, "post and response:")
        }

        def _call = {
            HttpURLConnection connection = new URL( "http://localhost:8280/" + _serverAddress).openConnection() as HttpURLConnection
            connection.setRequestMethod("POST")
            connection.setDoOutput(true)
            connection.setRequestProperty( 'User-Agent', 'groovy-2.4.4' )
            connection.setRequestProperty("Content-Type", "application/json")
            connection.getOutputStream().write(_payload.getBytes("UTF-8"));
            def postRC = connection.getResponseCode();
            return connection.getInputStream().getText()
        }
    }
}