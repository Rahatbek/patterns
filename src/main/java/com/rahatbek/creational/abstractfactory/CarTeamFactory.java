package com.rahatbek.creational.abstractfactory;

public interface CarTeamFactory {
    Worker getWorker();
    Driver getDriver();
    CarManager getCarManager();
}
