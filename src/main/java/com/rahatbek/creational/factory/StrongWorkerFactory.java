package com.rahatbek.creational.factory;

public class StrongWorkerFactory implements WorkerFactory {

    @Override
    public Worker createWorker() {
        return new StrongWorker();
    }
}
