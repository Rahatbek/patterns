package com.rahatbek.behavioral.command;

public class CarStateRunner {
    public static void main(String[] args) {
        CarState carState = new CarState();
        Worker worker = new Worker(
                new OpenCarDor(carState),
                new CloseCarDoor(carState),
                new RideCar(carState),
                new StopCar(carState)
        );

        worker.openCarDoor();
        worker.closeCarDoor();
        worker.rideCar();
        worker.stopCar();
    }
}
