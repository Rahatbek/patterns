package com.rahatbek.structural.facade;

public class Worker {
    public void doWork(JobTracker jobTracker) {
        if (jobTracker.isJobStatus()) {
            System.out.println("Worker is doing task");
        } else {
            System.out.println("Worker is resting");
        }
    }
}
