package com.navis.entities;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by bursode on 11/10/2017.
 */
@JsonDeserialize(using = ObjectWrapperDeserializer.class)
public class ObjectWrapper<T> {

    private Class<T> type;
    private  List<T> objects;

    public Class<T> getType() { return type; }

    public void setType(Class<T> inType) {
        type = inType;
    }

    public List<T> getObjects() {
        return objects;
    }

    public void setObjects(List<T> inObjects) {
        objects = inObjects;
    }
}
