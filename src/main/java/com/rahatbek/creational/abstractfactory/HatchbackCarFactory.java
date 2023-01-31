package com.rahatbek.creational.abstractfactory;

import com.rahatbek.creational.abstractfactory.hatchback.HatchbackTeamFactory;

public class HatchbackCarFactory {
    public static void main(String[] args) {
        HatchbackTeamFactory hatchbackTeamFactory = new HatchbackTeamFactory();
        Worker worker = hatchbackTeamFactory.getWorker();
        Driver driver = hatchbackTeamFactory.getDriver();
        CarManager hatchbackCM = hatchbackTeamFactory.getCarManager();

        System.out.println("Making hatchback car");
        worker.doCar();
        driver.testDrive();
        hatchbackCM.manageCar();
    }
}
