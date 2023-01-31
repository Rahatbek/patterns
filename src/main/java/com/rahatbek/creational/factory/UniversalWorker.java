package com.rahatbek.creational.factory;

public class UniversalWorker implements Worker{
    @Override
    public void doWork() {
        System.out.println("Universal worker does job.");
    }
}
