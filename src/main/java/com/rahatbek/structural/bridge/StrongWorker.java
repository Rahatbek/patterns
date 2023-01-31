package com.rahatbek.structural.bridge;

public class StrongWorker implements Worker{
    @Override
    public void doWork() {
        System.out.println("Strong worker makes simple job");
    }
}
