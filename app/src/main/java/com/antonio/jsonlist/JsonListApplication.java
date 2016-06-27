package com.antonio.jsonlist;

import android.app.Application;

import com.antonio.jsonlist.API.APIService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class JsonListApplication extends Application {

    private static JsonListApplication sInstance;

    private APIService apiService;

    @Override
    public void onCreate() {
        super.onCreate();

        sInstance = this;

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://guidebook.com/service/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(APIService.class);
    }

    public static JsonListApplication getApplicationInstance() {
        return sInstance;
    }

    public APIService getAPIService(){
        return apiService;
    }
}
