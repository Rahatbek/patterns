package com.rahatbek.structural.facade;

public class JobTracker {
    private boolean jobStatus;

    public boolean isJobStatus() {
        return jobStatus;
    }

    public void startJob() {
        System.out.println("Work is starting.");
        jobStatus = true;
    }

    public void finishJob() {
        System.out.println("Work is finish.");
        jobStatus = false;
    }
}
