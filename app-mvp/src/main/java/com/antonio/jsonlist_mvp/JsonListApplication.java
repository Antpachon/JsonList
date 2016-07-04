package com.antonio.jsonlist_mvp;

import android.app.Application;

import com.antonio.jsonlist_mvp.model.APIService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class JsonListApplication extends Application {

    private static JsonListApplication sInstance;

    private APIService apiService;

    @Override
    public void onCreate() {
        super.onCreate();

        sInstance = this;

        if (apiService != null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://guidebook.com/service/v2/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            apiService = retrofit.create(APIService.class);
        }

    }

    public static JsonListApplication getApplicationInstance() {
        return sInstance;
    }

    public APIService getAPIService(){
        return apiService;
    }

    //For setting mocks during testing
    public void setAPIService(APIService apiService) {
        this.apiService = apiService;
    }
}
