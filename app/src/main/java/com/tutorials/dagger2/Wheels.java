package com.tutorials.dagger2;

import javax.inject.Inject;

/**
 * Created by MD.Rabius sani raju on 6/30/22.
 */
public class Wheels {
    // we don`t this class so we can`t annotate it with @Inject

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
