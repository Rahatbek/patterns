package com.rahatbek.creational.abstractfactory.hatchback;

import com.rahatbek.creational.abstractfactory.CarManager;
import com.rahatbek.creational.abstractfactory.CarTeamFactory;
import com.rahatbek.creational.abstractfactory.Driver;
import com.rahatbek.creational.abstractfactory.Worker;

public class HatchbackTeamFactory implements CarTeamFactory {
    @Override
    public Worker getWorker() {
        return new HatchbackWorker();
    }

    @Override
    public Driver getDriver() {
        return new HatchbackDriver();
    }

    @Override
    public CarManager getCarManager() {
        return new HatchbackCM();
    }
}
