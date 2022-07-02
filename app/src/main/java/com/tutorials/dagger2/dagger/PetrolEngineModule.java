package com.tutorials.dagger2.dagger;

import com.tutorials.dagger2.car.Engine;
import com.tutorials.dagger2.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

/**
 * Created by MD.Rabius sani raju on 7/2/22.
 */
@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

}
