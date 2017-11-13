package com.navis.entities;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by bursode on 11/10/2017.
 */
public class ObjectWrapper {

    private String type;
    private  Object[] objects;

    public String getType() { return type; }
    public void setType(String inType) { type = inType; }

    public Object[] getObjects() {
        return objects;
    }
    public void setObjects(Object[] inObjects) {
        objects = inObjects;
    }
}
