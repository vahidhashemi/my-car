package com.sarreh.mycar.app;

import android.app.Application;

import com.sarreh.mycar.injector.component.AppComponent;
import com.sarreh.mycar.injector.component.DaggerAppComponent;
import com.sarreh.mycar.injector.module.AppModule;

public class App extends Application {

    private AppComponent appComponent;
    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
