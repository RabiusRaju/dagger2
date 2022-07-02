package com.tutorials.dagger2.car;

import android.util.Log;

/**
 * Created by MD.Rabius sani raju on 6/30/22.
 */
public class Tires {
    // we don`t this class so we can`t annotate it with @Inject
    public static final String TAG = "Car";

    public void inflate(){
        Log.d(TAG, "Tires inflated");
    }

}
