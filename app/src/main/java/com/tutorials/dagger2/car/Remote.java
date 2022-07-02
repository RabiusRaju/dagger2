package com.tutorials.dagger2.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by MD.Rabius sani raju on 6/30/22.
 */
public class Remote {
    public static final String TAG = "Remote";

    @Inject
    public Remote(){

    }

    public void setListener(Car car) {
        Log.d(TAG, "Remote connected");
    }
}
