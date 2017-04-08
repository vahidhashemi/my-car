package com.sarreh.domain;

import com.sarreh.mvp.model.Car;
import com.sarreh.mvp.model.ResponseWrapper;
import com.sarreh.repo.DBRepository;

import java.util.List;

import rx.Observable;

public class CarUsecase implements Usecase<ResponseWrapper<List<Car>>> {

    DBRepository repository;
    public CarUsecase(DBRepository repository) {
        this.repository = repository;
    }

    @Override
    public Observable<ResponseWrapper<List<Car>>> execute() {
        return repository.getCars();
    }
}
