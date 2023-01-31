package com.rahatbek.structural.bridge;

public class ProcessCreatorCar {
    public static void main(String[] args) {
        Car[] cars = {
                new SportCar(new SimpleWorker()),
                new StockExchange(new StrongWorker())
        };

        for (Car car : cars) {
            car.makeCar();
        }
    }
}
