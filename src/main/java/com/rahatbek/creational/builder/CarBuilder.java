package com.rahatbek.creational.builder;

public abstract class CarBuilder {

    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void buildName();
    abstract void buildTypeCar();
    abstract void buildPrice();

    Car getCar() {
        return car;
    }
}
