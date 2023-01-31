package com.rahatbek.creational.factory;

public class Job {
    public static void main(String[] args) {
        WorkerFactory workerFactory = createWorkerBySkills("strong");
        Worker worker = workerFactory.createWorker();

        worker.doWork();
    }

    static WorkerFactory createWorkerBySkills(String skill) {
        if (skill.equalsIgnoreCase("strong")) {
            return new StrongWorkerFactory();
        } else if (skill.equalsIgnoreCase("universal")) {
            return new UniversalWorkerFactory();
        } else if (skill.equalsIgnoreCase("simple")) {
            return new SimpleWorkerFactory();
        } else {
            throw new RuntimeException(skill + " is unknown skill.");
        }
    }
}
