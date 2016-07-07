package com.antonio.jsonlist_mvp.presenter;


import android.app.Activity;

import com.antonio.jsonlist_mvp.JsonListApplication;
import com.antonio.jsonlist_mvp.model.APIService;
import com.antonio.jsonlist_mvp.model.Data;
import com.antonio.jsonlist_mvp.view.SplashView;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SplashPresenter implements Presenter<SplashView> {

    private SplashView splashView;

    @Inject
    APIService apiService;

    @Override
    public void attachView(SplashView view) {
        this.splashView = view;
        ((JsonListApplication)splashView.getContext()).getComponent().inject(this);
    }

    @Override
    public void detachView() {
        this.splashView = null;
    }


    public void loadNetworkData(){

        Call<Data> serverCall = apiService.listGuides();

        serverCall.enqueue(new Callback<Data>() {

        @Override
        public void onResponse(Call<Data> call, Response<Data> response) {
            splashView.moveToNextScreen(response.body());
        }

        @Override
        public void onFailure(Call<Data> call, Throwable t) {
            splashView.displayErrorMessage();
        }
    });

    }

    //Testing purposes
    public APIService getApiService() {
        return apiService;
    }
}
