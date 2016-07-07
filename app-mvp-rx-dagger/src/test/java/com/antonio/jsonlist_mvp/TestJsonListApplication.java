package com.antonio.jsonlist_mvp;

import com.antonio.jsonlist_mvp.dagger.APIComponent;

public class TestJsonListApplication extends JsonListApplication {

    APIComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerTestAPIComponent.create();
    }

    @Override
    public APIComponent getComponent(){
        return component;
    }
}
