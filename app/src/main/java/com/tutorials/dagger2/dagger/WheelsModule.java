package com.tutorials.dagger2.dagger;

import com.tutorials.dagger2.car.Rims;
import com.tutorials.dagger2.car.Tires;
import com.tutorials.dagger2.car.Wheels;

import dagger.Module;
import dagger.Provides;

/**
 * Created by MD.Rabius sani raju on 6/30/22.
 */
@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims,tires);
    }
}
