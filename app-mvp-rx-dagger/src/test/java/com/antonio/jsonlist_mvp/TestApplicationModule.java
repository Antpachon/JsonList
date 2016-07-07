package com.antonio.jsonlist_mvp;

import com.antonio.jsonlist_mvp.model.APIService;

import org.mockito.Mockito;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class TestApplicationModule {

    @Provides
    @Singleton
    static APIService provideAPIService(){
        return Mockito.mock(APIService.class);
    }

}
