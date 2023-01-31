package com.rahatbek.creational.factory;

public class StrongWorker implements Worker{
    @Override
    public void doWork() {
        System.out.println("Strong worker does job.");
    }
}
