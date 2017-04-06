package com.sarreh.mvp.presenter;

import com.sarreh.domain.CarUsecase;
import com.sarreh.mvp.model.Car;
import com.sarreh.mvp.model.ResponseWrapper;
import com.sarreh.mvp.view.View;

import java.util.List;

import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class CarPresenter implements Presenter<View.CarView> {

    CarUsecase carUsecase;
    Subscription carSubscription;
    View.CarView carView;


    public CarPresenter(CarUsecase carUsecase) {
        this.carUsecase = carUsecase;
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {
        if (carSubscription != null && !carSubscription.isUnsubscribed())
            carSubscription.unsubscribe();
    }

    @Override
    public void onPause() {

    }

    @Override
    public void attachView(View.CarView view) {
        carView = view;
        getCars();
    }

    private void getCars() {
        carView.showLoading();
        carSubscription =carUsecase.execute()
                .subscribeOn(Schedulers.io())
                .onErrorResumeNext(new Func1<Throwable, Observable<? extends ResponseWrapper<List<Car>>>>() {
                    @Override
                    public Observable<? extends ResponseWrapper<List<Car>>> call(Throwable throwable) {
                        throwable.printStackTrace();
                        carView.showError();
                        return null;
                    }
                })
                .subscribe(new Action1<ResponseWrapper<List<Car>>>() {
                    @Override
                    public void call(ResponseWrapper<List<Car>> listResponseWrapper) {
                        carView.showData(listResponseWrapper.body);
                    }
                });
    }
}
