package com.rahatbek.creational.singleton;

public class CarRider {
    private static CarRider carRider;
    private static String carCondition = "This is condition of car . \n\n";

    public static synchronized CarRider getCarRider() {
        if (carRider == null) {
            carRider = new CarRider();
        }

        return carRider;
    }

    private CarRider() {
    }

    public void addCarInfo(String infoCondition) {
        carCondition += infoCondition + "\n";
    }

    public void showCarCondition() {
        System.out.println(carCondition);
    }
}
