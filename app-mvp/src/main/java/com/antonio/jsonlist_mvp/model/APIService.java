package com.antonio.jsonlist_mvp.model;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("upcomingGuides")
    Call<Data> listGuides();
}
