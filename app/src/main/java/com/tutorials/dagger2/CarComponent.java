package com.tutorials.dagger2;

import dagger.Component;

/**
 * Created by MD.Rabius sani raju on 6/30/22.
 */

@Component(modules = WheelsModule.class)
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);


}
