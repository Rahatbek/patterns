package com.rahatbek.creational.factory;

public class UniversalWorkerFactory implements WorkerFactory {
    @Override
    public Worker createWorker() {
        return new UniversalWorker();
    }
}
