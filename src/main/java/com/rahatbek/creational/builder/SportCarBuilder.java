package com.rahatbek.creational.builder;

public class SportCarBuilder extends CarBuilder{
    @Override
    void buildName() {
        car.setName("Sport car");
    }

    @Override
    void buildTypeCar() {
        car.setType(TypeCar.SPORT);
    }

    @Override
    void buildPrice() {
        car.setPrice(100000);
    }
}
