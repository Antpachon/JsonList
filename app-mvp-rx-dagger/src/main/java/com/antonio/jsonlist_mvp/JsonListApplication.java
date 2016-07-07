package com.antonio.jsonlist_mvp;

import android.app.Application;

import com.antonio.jsonlist_mvp.dagger.APIComponent;
import com.antonio.jsonlist_mvp.dagger.DaggerAPIComponent;

public class JsonListApplication extends Application {

    private APIComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAPIComponent.create();
    }

    public APIComponent getComponent() {
        return component;
    }
}
