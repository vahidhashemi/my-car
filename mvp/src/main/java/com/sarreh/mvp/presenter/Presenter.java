package com.sarreh.mvp.presenter;


import com.sarreh.mvp.view.View;

public interface Presenter<T extends View> {
    void onStart();
    void onStop();
    void onPause();
    void attachView(T view);

}
