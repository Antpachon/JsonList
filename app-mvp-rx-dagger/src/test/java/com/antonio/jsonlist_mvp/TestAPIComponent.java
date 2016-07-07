package com.antonio.jsonlist_mvp;

import com.antonio.jsonlist_mvp.dagger.APIComponent;
import com.antonio.jsonlist_mvp.presenter.SplashPresenter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {TestApplicationModule.class})
public interface TestAPIComponent extends APIComponent {

    void inject(SplashPresenter presenter);
}
