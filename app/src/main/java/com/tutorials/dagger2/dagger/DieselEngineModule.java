package com.tutorials.dagger2.dagger;

import com.tutorials.dagger2.car.DieselEngine;
import com.tutorials.dagger2.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by MD.Rabius sani raju on 7/2/22.
 */
@Module
public class DieselEngineModule {

    private int hoursePower;

    public DieselEngineModule(int hoursePower) {
        this.hoursePower = hoursePower;
    }

    @Provides
    int provideHoursePower(){
        return hoursePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine){
        return engine;
    }

}
