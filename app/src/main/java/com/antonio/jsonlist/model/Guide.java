package com.antonio.jsonlist.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Guide implements Serializable {

    @SerializedName("startDate")
    public String startDate;

    @SerializedName("endDate")
    public String endDate;

    @SerializedName("name")
    public String name;

    @SerializedName("url")
    public String url;

    @SerializedName("venue")
    public Venue venue;

    @SerializedName("icon")
    public String icon;

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public Venue getVenue() {
        return venue;
    }

    public String getIcon() {
        return icon;
    }
}
