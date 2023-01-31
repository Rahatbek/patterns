package com.rahatbek.structural.decorator;

public class Runner {
    public static void main(String[] args) {
        Worker worker = new HardWorker(new AdvanceWorker(new EasyWorker()));

        System.out.println(worker.doWork());
    }
}
