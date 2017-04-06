package com.sarreh.mycar.view.mainactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sarreh.mvp.model.Car;
import com.sarreh.mvp.presenter.CarPresenter;
import com.sarreh.mvp.view.View;
import com.sarreh.mycar.R;
import com.sarreh.mycar.injector.component.ActivityComponent;
import com.sarreh.mycar.injector.component.AppComponent;
import com.sarreh.mycar.injector.component.DaggerActivityComponent;
import com.sarreh.mycar.injector.component.DaggerAppComponent;
import com.sarreh.mycar.injector.module.CarModule;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements View.CarView {

    @Inject
    CarPresenter carPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppComponent appComponent = DaggerAppComponent
                .builder()
                .build();

        ActivityComponent activityComponent = DaggerActivityComponent
                .builder()
                .carModule(new CarModule())
                .appComponent(appComponent)
                .build();


    }


    @Override
    public void showLoading() {

    }

    @Override
    public void showError() {

    }

    @Override
    public void showData(List<Car> cars) {

    }
}
