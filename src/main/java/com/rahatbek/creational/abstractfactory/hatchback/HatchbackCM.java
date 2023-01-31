package com.rahatbek.creational.abstractfactory.hatchback;

import com.rahatbek.creational.abstractfactory.CarManager;

public class HatchbackCM implements CarManager {
    @Override
    public void manageCar() {
        System.out.println("Hatchback CM manages hatchback car.");
    }
}
