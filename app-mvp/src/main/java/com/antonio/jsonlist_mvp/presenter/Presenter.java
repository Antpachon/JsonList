package com.antonio.jsonlist_mvp.presenter;

public interface Presenter<V> {

    void attachView(V view);

    void detachView();

}
