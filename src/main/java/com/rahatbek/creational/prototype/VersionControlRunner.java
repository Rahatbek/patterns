package com.rahatbek.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Car master = new Car(1, "SuperCar", "SourceScheme = new SourceName();");

        System.out.println(master);

        CarFactory factory = new CarFactory(master);
        Car masterClone = factory.cloneCar();

        System.out.println("-----------------");
        System.out.println(masterClone);
    }
}
