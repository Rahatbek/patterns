package com.rahatbek.behavioral.command;

public class StopCar implements Command{
    CarState carState;

    public StopCar(CarState carState) {
        this.carState = carState;
    }

    @Override
    public void execute() {
        carState.stopCar();
    }
}
