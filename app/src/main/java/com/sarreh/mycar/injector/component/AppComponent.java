package com.sarreh.mycar.injector.component;

import com.sarreh.mycar.injector.module.AppModule;
import com.sarreh.mycar.injector.scope.PerApplication;

import dagger.Component;

@Component(modules = AppModule.class)
@PerApplication
public interface AppComponent {

}
