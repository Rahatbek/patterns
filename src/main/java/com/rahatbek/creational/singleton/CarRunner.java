package com.rahatbek.creational.singleton;

public class CarRunner {
    public static void main(String[] args) {
        System.out.println(CarRider.getCarRider().toString());
        System.out.println(CarRider.getCarRider().toString());
        System.out.println(CarRider.getCarRider().toString());

        CarRider.getCarRider().addCarInfo("First car");
        CarRider.getCarRider().addCarInfo("Second car");
        CarRider.getCarRider().addCarInfo("Third car");

        CarRider.getCarRider().showCarCondition();
    }
}
