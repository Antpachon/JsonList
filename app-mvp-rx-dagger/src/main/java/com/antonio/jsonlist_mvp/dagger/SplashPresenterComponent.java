package com.antonio.jsonlist_mvp.dagger;

import com.antonio.jsonlist_mvp.view.SplashActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface SplashPresenterComponent {

    void inject(SplashActivity activity);

}
