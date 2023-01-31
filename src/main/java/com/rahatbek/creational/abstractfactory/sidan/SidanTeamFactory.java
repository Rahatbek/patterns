package com.rahatbek.creational.abstractfactory.sidan;

import com.rahatbek.creational.abstractfactory.CarManager;
import com.rahatbek.creational.abstractfactory.CarTeamFactory;
import com.rahatbek.creational.abstractfactory.Driver;
import com.rahatbek.creational.abstractfactory.Worker;

public class SidanTeamFactory implements CarTeamFactory {
    @Override
    public Worker getWorker() {
        return new SidanWorker();
    }

    @Override
    public Driver getDriver() {
        return new SidanDriver();
    }

    @Override
    public CarManager getCarManager() {
        return new SidanCM();
    }
}
