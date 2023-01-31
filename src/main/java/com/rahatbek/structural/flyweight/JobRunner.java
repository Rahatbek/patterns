package com.rahatbek.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class JobRunner {
    public static void main(String[] args) {
        WorkerFactory workerFactory = new WorkerFactory();

        List<Worker> workers = new ArrayList<>();

        workers.add(workerFactory.getWorkerBySkill("simple"));
        workers.add(workerFactory.getWorkerBySkill("simple"));
        workers.add(workerFactory.getWorkerBySkill("simple"));
        workers.add(workerFactory.getWorkerBySkill("simple"));
        workers.add(workerFactory.getWorkerBySkill("simple"));
        workers.add(workerFactory.getWorkerBySkill("simple"));
        workers.add(workerFactory.getWorkerBySkill("simple"));
        workers.add(workerFactory.getWorkerBySkill("simple"));
        workers.add(workerFactory.getWorkerBySkill("strong"));
        workers.add(workerFactory.getWorkerBySkill("strong"));
        workers.add(workerFactory.getWorkerBySkill("strong"));
        workers.add(workerFactory.getWorkerBySkill("strong"));
        workers.add(workerFactory.getWorkerBySkill("strong"));
        workers.add(workerFactory.getWorkerBySkill("strong"));
        workers.add(workerFactory.getWorkerBySkill("strong"));
        workers.add(workerFactory.getWorkerBySkill("strong"));

        for (Worker worker : workers) {
            worker.doWork();
        }
    }
}
