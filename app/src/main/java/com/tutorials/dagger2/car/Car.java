package com.tutorials.dagger2.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by MD.Rabius sani raju on 6/30/22.
 */
public class Car {
    private static final String TAG = "Car";
    private Engine engine;
    private Wheels wheels;


    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }


    public void drive(){
        engine.start();
        Log.d(TAG, "drive....");
    }
}
