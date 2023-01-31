package com.rahatbek.structural.bridge;

public abstract class Car {
    protected Worker worker;

    protected Car(Worker worker) {
        this.worker = worker;
    }

    public abstract void makeCar();
}
