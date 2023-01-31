package com.rahatbek.behavioral.command;

public class CloseCarDoor implements Command{
    CarState carState;

    public CloseCarDoor(CarState carState) {
        this.carState = carState;
    }

    @Override
    public void execute() {
        carState.closeCar();
    }
}
