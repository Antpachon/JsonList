package com.antonio.jsonlist_mvp.view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.antonio.jsonlist_mvp.R;
import com.antonio.jsonlist_mvp.model.Data;
import com.antonio.jsonlist_mvp.presenter.SplashPresenter;

import javax.inject.Inject;

public class SplashActivity extends AppCompatActivity implements SplashView {

    public static String DATA_TAG = "data_tag";
    @Inject SplashPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        presenter.attachView(this);

        presenter.loadNetworkData();
    }

    @Override
    protected void onDestroy() {
        presenter.detachView();
        super.onDestroy();
    }

    @Override
    public void moveToNextScreen(Data response) {
        Intent mainIntent = new Intent(SplashActivity.this,MainActivity.class);
        mainIntent.putExtra(DATA_TAG, response);
        startActivity(mainIntent);
        finish();
    }

    @Override
    public void displayErrorMessage() {
        Toast.makeText(SplashActivity.this, getString(R.string.error_fetching_list),Toast.LENGTH_LONG).show();
        finish();
    }

    @Override
    public Context getContext() {
        return this;
    }
}
