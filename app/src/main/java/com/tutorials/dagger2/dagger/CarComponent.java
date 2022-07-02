package com.tutorials.dagger2.dagger;

import com.tutorials.dagger2.MainActivity;
import com.tutorials.dagger2.car.Car;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by MD.Rabius sani raju on 6/30/22.
 */

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(int horsePower);


        CarComponent build();
    }


}
