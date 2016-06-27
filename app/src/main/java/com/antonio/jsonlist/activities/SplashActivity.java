package com.antonio.jsonlist.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.antonio.jsonlist.JsonListApplication;
import com.antonio.jsonlist.R;
import com.antonio.jsonlist.model.Data;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SplashActivity extends AppCompatActivity {

    public static String DATA_TAG = "data_tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Call<Data> serverCall = JsonListApplication.getApplicationInstance().getAPIService().listGuides();
        serverCall.enqueue(new Callback<Data>() {

            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {
                Intent mainIntent = new Intent(SplashActivity.this,MainActivity.class);
                mainIntent.putExtra(DATA_TAG, response.body());
                startActivity(mainIntent);
                finish();
            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {
                Toast.makeText(SplashActivity.this, getString(R.string.error_fetching_list),Toast.LENGTH_LONG).show();
                finish();
            }
        });

    }
}
