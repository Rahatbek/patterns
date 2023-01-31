package com.rahatbek.structural.bridge;

public class StockExchange extends Car{

    protected StockExchange(Worker worker) {
        super(worker);
    }
    @Override
    public void makeCar() {
        System.out.println("Stock Exchange making in progress...");
        worker.doWork();
    }
}
