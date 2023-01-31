package com.rahatbek.creational.abstractfactory.hatchback;

import com.rahatbek.creational.abstractfactory.Worker;

public class HatchbackWorker implements Worker {
    @Override
    public void doCar() {
        System.out.println("Hatchback worker makes hatchback car.");
    }
}
