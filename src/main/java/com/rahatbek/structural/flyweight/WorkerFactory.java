package com.rahatbek.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WorkerFactory {
    private static final Map<String, Worker> workers = new HashMap<>();

    public Worker getWorkerBySkill(String skill) {
        Worker worker = workers.get(skill);

        if (worker == null) {
            switch (skill) {
                case "simple":
                    System.out.println("Hiring simple worker");
                    worker = new SimpleWorker();
                    break;
                case "strong":
                    System.out.println("Hiring strong worker");
                    worker = new StrongWorker();
                    break;
            }
            workers.put(skill, worker);
        }
        return worker;
    }
}
