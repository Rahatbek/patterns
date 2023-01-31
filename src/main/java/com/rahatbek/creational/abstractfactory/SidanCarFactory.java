package com.rahatbek.creational.abstractfactory;

import com.rahatbek.creational.abstractfactory.sidan.SidanTeamFactory;

public class SidanCarFactory {
    public static void main(String[] args) {
        SidanTeamFactory sidanTeamFactory = new SidanTeamFactory();
        Worker worker = sidanTeamFactory.getWorker();
        Driver driver = sidanTeamFactory.getDriver();
        CarManager carManager = sidanTeamFactory.getCarManager();

        System.out.println("Making sidan car");
        worker.doCar();
        driver.testDrive();
        carManager.manageCar();
    }
}
