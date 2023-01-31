package com.rahatbek.structural.decorator;

public class HardWorker extends WorkerDecorator{
    public HardWorker(Worker worker) {
        super(worker);
    }

    public String acceptWeekJob() {
        return " Accept job.";
    }

    @Override
    public String doWork() {
        return super.doWork() + acceptWeekJob();
    }
}
