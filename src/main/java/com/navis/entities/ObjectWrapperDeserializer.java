package com.navis.entities;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by bursode on 11/13/2017.
 */
public class ObjectWrapperDeserializer extends JsonDeserializer<ObjectWrapper> {
    @Override
    public ObjectWrapper deserialize(JsonParser inParser, DeserializationContext inContext)
            throws IOException, JsonProcessingException {
        InnerObjectWrapper innerOw = inParser.readValueAs(InnerObjectWrapper.class);
        return innerOw.toObjectWrapper();
    }

    private static class InnerObjectWrapper {
        public String type;
        public Object[] objects;

        ObjectWrapper toObjectWrapper() {
            ObjectWrapper ow = new ObjectWrapper();

            final Class clss = classForType(type);
            ow.setType(clss);
            List list = (List) Arrays.stream(objects)
                    .map(o -> new ObjectMapper().convertValue(o, clss))
                    .collect(Collectors.toList());
            ow.setObjects(list);
            return ow;
        }

        private Class classForType(String inType) {
            if ("ues".equals(inType)) {
                return UnitEquipment.class;
            } else if( "ufv".equals(inType)) {
                return  Ufv.class;
            } else if("was".equals(inType)) {
                return WorkAssignment.class;
            } else if("wis".equals(inType)) {
                return WorkInstruction.class;
            } else if("unit".equals(inType)) {
                return Unit.class;
            } else if("cvs".equals(inType)) {
                return CarrierVisit.class;
            } else if("timing".equals(inType)) {
                return TimingData.class;
            }
            return null;
        }
    }
}
