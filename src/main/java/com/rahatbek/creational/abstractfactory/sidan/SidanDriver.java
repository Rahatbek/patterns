package com.rahatbek.creational.abstractfactory.sidan;

import com.rahatbek.creational.abstractfactory.Driver;

public class SidanDriver implements Driver {
    @Override
    public void testDrive() {
        System.out.println("Sidan driver drives sidan car.");
    }
}
