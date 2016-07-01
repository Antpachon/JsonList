package com.antonio.jsonlist_mvp.presenter;


import com.antonio.jsonlist_mvp.JsonListApplication;
import com.antonio.jsonlist_mvp.model.Data;
import com.antonio.jsonlist_mvp.view.SplashView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SplashPresenter implements Presenter<SplashView> {

    private SplashView splashView;

    @Override
    public void attachView(SplashView view) {
        this.splashView = view;
    }

    @Override
    public void detachView() {
        this.splashView = null;
    }


    public void loadNetworkData(){

        //In theory the presenter shouldn't know about Android and the API service could be injected
        // as a dependency (dagger 2) but for the sake of simplicity in this architectural example we can ignore this
        // and leave getApplicationInstance
        Call<Data> serverCall = JsonListApplication.getApplicationInstance().getAPIService().listGuides();

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
