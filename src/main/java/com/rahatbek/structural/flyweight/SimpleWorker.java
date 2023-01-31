package com.rahatbek.structural.flyweight;

public class SimpleWorker implements Worker{
    @Override
    public void doWork() {
        System.out.println("Simple worker does simple work.");
    }
}
