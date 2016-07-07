package com.antonio.jsonlist_mvp.dagger;

import com.antonio.jsonlist_mvp.model.APIService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    @Provides
    @Singleton
    static APIService provideAPIService(){
        return APIService.Factory.create();
    }

}
