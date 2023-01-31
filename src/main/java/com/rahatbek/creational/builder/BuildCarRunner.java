package com.rahatbek.creational.builder;

public class BuildCarRunner {
    public static void main(String[] args) {
        MachineManufacturing manufacturing = new MachineManufacturing();

        System.out.println("Building Simple Car");
        manufacturing.setBuilder(new SimpleCarBuild());
        Car simpleCar = manufacturing.buildCar();

        System.out.println(simpleCar);

        System.out.println("-------------------------------------------------");


        System.out.println("Building Sport Car");
        manufacturing.setBuilder(new SportCarBuilder());
        Car sportCar = manufacturing.buildCar();

        System.out.println(sportCar);
    }
}
