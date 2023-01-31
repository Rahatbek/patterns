package com.rahatbek.structural.facade;

public class Workflow {
    Worker worker = new Worker();

    Job job = new Job();

    JobTracker jobTracker = new JobTracker();

    public void doTask() {
        job.doJob();
        jobTracker.startJob();
        worker.doWork(jobTracker);
    }
}
