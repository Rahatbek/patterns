package com.rahatbek.behavioral.command;

public class OpenCarDor implements Command{
    CarState carState;

    public OpenCarDor(CarState carState) {
        this.carState = carState;
    }

    @Override
    public void execute() {
        carState.openCar();
    }
}
