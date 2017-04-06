package com.sarreh.domain;

import com.sarreh.mvp.model.Car;
import com.sarreh.mvp.model.ResponseWrapper;

import java.util.List;

import rx.Observable;

public class CarUsecase implements Usecase<ResponseWrapper<List<Car>>> {

    @Override
    public Observable<ResponseWrapper<List<Car>>> execute() {
        return null;
    }
}
