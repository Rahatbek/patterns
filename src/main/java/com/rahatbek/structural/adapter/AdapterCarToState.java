package com.rahatbek.structural.adapter;

public class AdapterCarToState extends CarApplication implements CarState {

    @Override
    public void open() {
        openCar();
    }

    @Override
    public void close() {
        closeCar();
    }

    @Override
    public void ride() {
        rideCar();
    }

    @Override
    public void stop() {
        stopCar();
    }
}
