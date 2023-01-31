package com.rahatbek.structural.decorator;

public class AdvanceWorker extends WorkerDecorator{
    public AdvanceWorker(Worker worker) {
        super(worker);
    }

    public String checkJobReview() {
        return " Make job review.";
    }

    @Override
    public String doWork() {
        return super.doWork() + checkJobReview();
    }
}
