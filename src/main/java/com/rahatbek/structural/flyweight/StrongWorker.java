package com.rahatbek.structural.flyweight;

public class StrongWorker implements Worker{
    @Override
    public void doWork() {
        System.out.println("Strong worker does strong work.");
    }
}
