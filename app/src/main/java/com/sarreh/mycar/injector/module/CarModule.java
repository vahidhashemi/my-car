package com.sarreh.mycar.injector.module;

import com.sarreh.domain.CarUsecase;
import com.sarreh.mvp.presenter.CarPresenter;
import com.sarreh.mycar.injector.scope.PerActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {

    @Provides
    @PerActivity
    public CarUsecase carUsecase() {
        return new CarUsecase();
    }

    @Provides
    @PerActivity
    public CarPresenter carPresenter(CarUsecase carUsecase) {
        return new CarPresenter(carUsecase);
    }
}
