package com.navis.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by bursode on 11/1/2017.
 */
public class Person implements Serializable {
    private String id;
    private Name name;
    private Address address;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
    private Date birthday;

    public Person() {}

    @JsonCreator
    public Person(
            @JsonProperty("_id") String id,
            @JsonProperty("_name") Name name,
            @JsonProperty("_address") Address address,
            @JsonProperty("_birthday") Date birthday) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }
    public void setId(final String inId) {
        id = inId;
    }

    public Name getName() {
        return name;
    }
    public void setName(final Name inName) {
        name = inName;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(final Address inAddress) {
        address = inAddress;
    }

    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(final Date inBirthday) {
        birthday = inBirthday;
    }
}
