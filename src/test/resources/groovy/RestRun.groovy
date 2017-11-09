package extension.system

import com.fasterxml.jackson.annotation.JsonFormat
import com.navis.argo.business.atoms.LocTypeEnum
import com.navis.framework.metafields.MetafieldIdList
import com.navis.framework.persistence.HibernateApi
import com.navis.framework.portal.QueryUtils
import com.navis.framework.portal.query.DomainQuery
import com.navis.framework.portal.query.PredicateFactory
import com.navis.framework.util.ValueObject
import com.navis.inventory.InventoryEntity
import com.navis.inventory.business.api.UnitField
import com.navis.inventory.business.units.UnitEquipment
import com.navis.inventory.business.units.UnitFacilityVisit
import org.codehaus.jackson.annotate.JsonGetter

/**
 * Created by bursode on 11/2/2017.
 */
import java.net.HttpURLConnection
import org.codehaus.jackson.map.ObjectMapper
import org.codehaus.jackson.map.*
import org.codehaus.jackson.JsonNode
import org.codehaus.jackson.JsonFactory
import org.codehaus.jackson.JsonParser

import java.util.concurrent.Callable
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.Future

import com.navis.argo.business.api.GroovyApi

import org.apache.log4j.Logger

import java.util.List
import java.util.ArrayList
import java.util.Collections

/**
 * Invoke a web service code extension on a list of specified nodes and concatenate all responses.
 */
class RestRun extends GroovyApi {
    /**
     * Entry point for GroovyApi plugin
     */
    public void execute(Map inParams) {
        1.upto(10, _getLoop)
        1.upto(10, _postLoop)
    }

    def _postLoop = {
        long now = System.currentTimeMillis()
        String response = doPost()
        println (String.format("Call Post object 100 times: %dms", (System.currentTimeMillis() - now)))
    }

    def _getLoop = {
        long now = System.currentTimeMillis();
        String response = doGet()
        println (String.format("Call get object 100 times: %d ms", (System.currentTimeMillis() - now)))
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

    private List<Map<String, String>> fetchEquipmentData() {
        DomainQuery dq = QueryUtils.createDomainQuery(InventoryEntity.UNIT_EQUIPMENT)
        Serializable[] ufvGkeys = HibernateApi.getInstance().findPrimaryKeysByDomainQuery(dq);
        List<UnitEquipment> eq = ufvGkeys.collect {inIt -> (UnitEquipment) HibernateApi.getInstance().load(UnitFacilityVisit.class, inIt) }
        List<ValueObject> visitObjects = eq.collect{inIt -> inIt.getValueObject()}
        return visitObjects.collect {inIt -> inIt.getFields().collectEntries {[(it.getFieldId()):inIt.getFieldAsString(it)]}}
    }


    private List<Map<String, String>> fetchUfvData() {
        DomainQuery dq = QueryUtils.createDomainQuery(InventoryEntity.UNIT_FACILITY_VISIT)
        Serializable[] ufvGkeys = HibernateApi.getInstance().findPrimaryKeysByDomainQuery(dq);
        List<UnitFacilityVisit> visits = ufvGkeys.collect {inIt -> (UnitFacilityVisit) HibernateApi.getInstance().load(UnitFacilityVisit.class, inIt) }
        List<ValueObject> visitObjects = visits.collect{inIt -> inIt.getValueObject()}
        return visitObjects.collect {inIt -> inIt.getFields().collectEntries {[(it.getFieldId()):inIt.getFieldAsString(it)]}}
    }

    private doPost() {
        def fieldLists = fetchUfvData()
        def jsonLists = fieldLists.collect { inFl -> new ObjectMapper().writeValueAsString(inFl) }
        def service = "rest/ufv"
        Callable callable = new PostCallable(service, jsonLists.get(0))
        ExecutorService executor = Executors.newFixedThreadPool(10)

        List<Future<String>> list = (1..100).collect {executor.submit(callable)}
        List<String> responses = list.collect {inFuture -> inFuture.get()}
        //String responses = list.collect {inFuture -> inFuture.get()}.join(",\n")
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
            logInfo("call webservice:"+ "http://localhost:8280/" + _serverAddress + _params)
            HttpURLConnection connection = new URL( "http://localhost:8280/" + _serverAddress + _params).openConnection() as HttpURLConnection
            connection.setRequestProperty( 'User-Agent', 'groovy-2.4.4' )
            connection.setRequestProperty( 'Accept', 'application/json' )
            return connection.inputStream.text
        }
    }


    class PostCallable implements Callable<String> {

        private final String _serverAddress;
        private final String _params

        PostCallable(String inServerAddress, String inParams) {
            _serverAddress = inServerAddress
//            _params = "{" + inParams.collect{ inK, inV -> "\"$inK\":\"$inV\""}.join(',') + "}"
            _params = inParams
        }
        PostCallable(String inServerAddress, Map inParams) {
            _serverAddress = inServerAddress
            _params = new ObjectMapper().writeValueAsString(inParams)
        }

        @Override
        String call() throws Exception {
            HttpURLConnection connection = new URL( "http://localhost:8280/" + _serverAddress).openConnection() as HttpURLConnection

            connection.setRequestMethod("POST")
            connection.setDoOutput(true)
            connection.setRequestProperty( 'User-Agent', 'groovy-2.4.4' )
            connection.setRequestProperty("Content-Type", "application/json")
            connection.getOutputStream().write(_params.getBytes("UTF-8"));
            def postRC = connection.getResponseCode();
            return connection.getInputStream().getText()
        }
    }
}