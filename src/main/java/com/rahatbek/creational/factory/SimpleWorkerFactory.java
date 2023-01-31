package com.rahatbek.creational.factory;

public class SimpleWorkerFactory implements WorkerFactory{
    @Override
    public Worker createWorker() {
        return new SimpleWorker();
    }
}
