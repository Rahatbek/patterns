package com.rahatbek.creational.builder;

public class SimpleCarBuild extends CarBuilder{
    @Override
    void buildName() {
        car.setName("Simle car");
    }

    @Override
    void buildTypeCar() {
        car.setType(TypeCar.SIMPLE);
    }

    @Override
    void buildPrice() {
        car.setPrice(5000);
    }
}
