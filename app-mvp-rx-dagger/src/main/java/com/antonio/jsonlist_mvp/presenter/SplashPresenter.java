package com.antonio.jsonlist_mvp.presenter;


import com.antonio.jsonlist_mvp.model.APIService;
import com.antonio.jsonlist_mvp.model.Data;
import com.antonio.jsonlist_mvp.view.SplashView;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SplashPresenter implements Presenter<SplashView> {

    private SplashView splashView;

    APIService apiService;

    @Inject
    public SplashPresenter(APIService apiService) {
        this.apiService = apiService;
    }

    @Override
    public void attachView(SplashView view) {
        this.splashView = view;
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
}
