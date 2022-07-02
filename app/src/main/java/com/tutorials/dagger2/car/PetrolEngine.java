package com.tutorials.dagger2.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by MD.Rabius sani raju on 7/2/22.
 */
public class PetrolEngine implements Engine {

    public static final String TAG = "Car";
    private int hoursPower;


    @Inject
    public PetrolEngine(int hoursPower){
        this.hoursPower = hoursPower;
    }

    @Override
    public void start(){
        Log.d(TAG, "Petrol engine started. Horsepower: "+ hoursPower);
    }

}
