package com.sarreh.mycar.injector.module;


import android.app.Application;

import com.sarreh.mycar.app.App;
import com.sarreh.mycar.injector.scope.PerApplication;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private App app;
    public AppModule(App app) {
        this.app = app;
    }

    @Provides
    @PerApplication
    public Application applicationContext() {
        return app;
    }

    @Provides
    @PerApplication
    public App app() {
        return app;
    }
}
