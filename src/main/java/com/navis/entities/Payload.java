package com.navis.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Created by bursode on 11/28/2017.
 */
@JsonDeserialize(using = PayloadDeserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Payload {
    private Long timestamp;
    private ObjectWrapper[] payload;

    public void setTimestamp(Long inTimestamp) {
        timestamp = inTimestamp;
    }
    public Long getTimestamp() {
        return timestamp;
    }

    public void setPayload(ObjectWrapper[] inWrappers) {
        payload = inWrappers;
    }
    public ObjectWrapper[] getPayload() {
        return payload;
    }
}
