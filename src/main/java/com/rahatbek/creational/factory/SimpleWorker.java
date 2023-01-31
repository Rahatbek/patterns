package com.rahatbek.creational.factory;

public class SimpleWorker implements Worker{
    @Override
    public void doWork() {
        System.out.println("Simple worker does job.");
    }
}
