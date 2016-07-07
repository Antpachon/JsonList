package com.antonio.jsonlist_mvp.dagger;

import com.antonio.jsonlist_mvp.presenter.SplashPresenter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface APIComponent {

    void inject(SplashPresenter presenter);

}
