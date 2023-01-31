package com.rahatbek.creational.abstractfactory.sidan;

import com.rahatbek.creational.abstractfactory.CarManager;

public class SidanCM implements CarManager {
    @Override
    public void manageCar() {
        System.out.println("Sidan CM manages sidan car.");
    }
}
