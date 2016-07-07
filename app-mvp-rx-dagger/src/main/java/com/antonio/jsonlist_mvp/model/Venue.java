package com.antonio.jsonlist_mvp.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Venue implements Serializable {

    @SerializedName("city")
    public String city = "";

    @SerializedName("state")
    public String state = "";

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }


    @Override
    public String toString() {
        return city + " "+state;
    }
}
