package com.navis.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


/**
 * Created by bursode on 11/5/2017.
 */
public class Address implements Serializable {
    private String street;
    private String city;
    private String state;
    private String zip;

    @JsonCreator
    public Address(
            @JsonProperty("_street") String street,
            @JsonProperty("_city") String city,
            @JsonProperty("_state") String state,
            @JsonProperty("_zip") String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public void setStreet(final String inStreet) {
        this.street = inStreet;
    }
    public String getStreet() {
        return street;
    }

    public void setCity(final String inCity) {
        this.city = inCity;
    }
    public String getCity() {
        return city;
    }

    public void setState(final String inState) {
        this.state = inState;
    }
    public String getState() {
        return state;
    }

    public void setZip(final String inZip) {
        this.zip = inZip;
    }
    public String getZip() {
        return zip;
    }
}
