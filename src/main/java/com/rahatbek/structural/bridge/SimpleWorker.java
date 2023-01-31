package com.rahatbek.structural.bridge;

public class SimpleWorker implements Worker{
    @Override
    public void doWork() {
        System.out.println("Simple worker makes simple job");
    }
}
