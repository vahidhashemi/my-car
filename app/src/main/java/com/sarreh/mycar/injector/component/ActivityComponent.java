package com.sarreh.mycar.injector.component;

import com.sarreh.mycar.injector.module.CarModule;
import com.sarreh.mycar.injector.scope.PerActivity;
import com.sarreh.mycar.view.mainactivity.MainActivity;

import dagger.Component;

@Component (dependencies = AppComponent.class,
        modules = CarModule.class)
@PerActivity
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
