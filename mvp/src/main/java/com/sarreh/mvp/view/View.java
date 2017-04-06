package com.sarreh.mvp.view;


import com.sarreh.mvp.model.Car;

import java.util.List;

public interface View {

    interface CarView extends View {
        void showLoading();
        void showError();
        void showData(List<Car> cars);
    }
}
