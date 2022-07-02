package com.tutorials.dagger2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.tutorials.dagger2.car.Car;
import com.tutorials.dagger2.dagger.CarComponent;
import com.tutorials.dagger2.dagger.DaggerCarComponent;
import com.tutorials.dagger2.dagger.DieselEngineModule;

import javax.inject.Inject;

/**
 * Created by MD.Rabius sani raju on 6/30/22.
 */
public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder()
                        .horsePower(120)
                        .build();

        component.inject(this);

        car.drive();
    }
}
