package com.antonio.jsonlist_mvp.view;

import com.antonio.jsonlist_mvp.model.Data;

public interface SplashView extends MvpView {

    void moveToNextScreen(Data jsonData);

    void displayErrorMessage();
}
