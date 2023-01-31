package com.rahatbek.creational.builder;

public class MachineManufacturing {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    Car buildCar() {
        builder.createCar();
        builder.buildName();
        builder.buildTypeCar();
        builder.buildPrice();

        Car car = builder.getCar();

        return car;
    }
}
