package com.antonio.jsonlist.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Data implements Serializable{

    @SerializedName("data")
    List<Guide> guideList = new ArrayList<Guide>();

    public List<Guide> getGuideList() {
        return guideList;
    }
}
