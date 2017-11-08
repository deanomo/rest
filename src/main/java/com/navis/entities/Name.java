package com.navis.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Name implements Serializable {

    private List<String> given;
    private String last;
    private List<String> prefix;
    private List<String> suffix;

    public Name() {}

    @JsonCreator
    public Name(
            @JsonProperty("_given") List<String> given,
            @JsonProperty("_last") String last,
            @JsonProperty("_prefix") List<String> prefix,
            @JsonProperty("_suffix") List<String> suffix) {
        this.given = given;
        this.last = last;
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public void setGiven(final List<String> inGiven) {
        this.given = inGiven;
    }
    public List<String> getGiven() {
        return given;
    }

    public void setLast(final String inLast) {
        this.last = inLast;
    }
    public String getLast() {
        return last;
    }

    public void setPrefix(final List<String> inPrefix) {
        this.prefix = inPrefix;
    }
    public void setPrefix(final String inPrefix) {
        if(inPrefix != null) {
            if (prefix==null) {
                prefix = new ArrayList<>();
            }
            prefix.add(inPrefix);
        }
    }
    public List<String> getPrefix() {
        return prefix;
    }

    public void setSuffix(final List<String> inSuffix) {
        this.suffix = inSuffix;
    }
    public List<String> getSuffix() {
        return suffix;
    }
}
