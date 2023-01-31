package com.rahatbek.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Worker> workers = new ArrayList<>();

    public void adWorker(Worker worker) {
        workers.add(worker);
    }

    public void removeWorker(Worker worker) {
        workers.remove(worker);
    }

    public void createSomething() {
        System.out.println("Team create something\n");
        for (Worker worker : workers) {
            worker.doWork();
        }
    }
}
