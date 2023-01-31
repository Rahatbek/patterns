package com.rahatbek.creational.abstractfactory.hatchback;

import com.rahatbek.creational.abstractfactory.Driver;

public class HatchbackDriver implements Driver {
    @Override
    public void testDrive() {
        System.out.println("Hatchback Driver drives a hatchback car.");
    }
}
