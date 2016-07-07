package com.antonio.jsonlist_mvp.model;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface APIService {

    @GET("upcomingGuides")
    Call<Data> listGuides();


    class Factory {
        public static APIService create() {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.github.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            return retrofit.create(APIService.class);
        }
    }
}
