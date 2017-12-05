package com.navis.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by bursode on 11/28/2017.
 */
public class PayloadDeserializer extends JsonDeserializer<Payload> {
    @Override
    public Payload deserialize(JsonParser inParser, DeserializationContext inContext)
            throws IOException, JsonProcessingException {
        JsonNode node = inParser.getCodec().readTree(inParser);
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<ObjectWrapper>> tRef = new TypeReference<List<ObjectWrapper>>() {};
        List<ObjectWrapper> ow = mapper.readValue(mapper.treeAsTokens(node.get("payload")), tRef);
        PayloadDeserializer.InnerPayload innerPl = inParser.readValueAs(PayloadDeserializer.InnerPayload.class);
        return innerPl.toPayload();
    }

    private static class InnerPayload {
        public Long timestamp;
        public List<GenObject> objects;

        Payload toPayload() {
            Payload payload = new Payload();
            payload.setTimestamp(timestamp);
         //   payload.setPayload(objects);
            return payload;
        }
    }
}
