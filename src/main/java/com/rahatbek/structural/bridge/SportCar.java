package com.rahatbek.structural.bridge;

public class SportCar extends Car{
    protected  SportCar(Worker worker) {
        super(worker);
    }
    @Override
    public void makeCar() {
        System.out.println("Sport car system produce in progress");
        worker.doWork();
    }
}
