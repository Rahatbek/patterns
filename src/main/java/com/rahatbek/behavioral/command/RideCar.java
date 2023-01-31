package com.rahatbek.behavioral.command;

public class RideCar implements Command{
    CarState carState;

    public RideCar(CarState carState) {
        this.carState = carState;
    }

    @Override
    public void execute() {
        carState.rideCar();
    }
}
