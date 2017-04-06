package com.sarreh.domain;


import rx.Observable;

public interface Usecase<T> {
    Observable<T> execute();
}
