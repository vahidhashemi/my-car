package com.sarreh.repo;

import com.sarreh.mvp.model.Car;
import com.sarreh.mvp.model.ResponseWrapper;

import java.util.List;

import rx.Observable;

public interface DBRepository {
    Observable<ResponseWrapper<List<Car>>> getCars();
}
