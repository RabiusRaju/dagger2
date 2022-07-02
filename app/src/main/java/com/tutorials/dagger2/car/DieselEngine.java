package com.tutorials.dagger2.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by MD.Rabius sani raju on 7/2/22.
 */
public class DieselEngine implements Engine{
    private static final String TAG = "Car";
    private int hoursePower;

    @Inject
    public DieselEngine(int hoursePower){
        this.hoursePower = hoursePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel Engine started : Hoursepower "+ hoursePower);
    }
}
