package com.rahatbek.creational.abstractfactory.sidan;

import com.rahatbek.creational.abstractfactory.Worker;

public class SidanWorker implements Worker {
    @Override
    public void doCar() {
        System.out.println("Sidan worker makes sidan car");
    }
}
