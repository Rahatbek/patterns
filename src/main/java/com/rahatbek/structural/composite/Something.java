package com.rahatbek.structural.composite;

public class Something {
    public static void main(String[] args) {
        Team team = new Team();

        Worker fistStrongWorker = new StrongWorker();
        Worker secondStrongWorker = new StrongWorker();
        Worker simpleWorker = new SimpleWorker();

        team.adWorker(fistStrongWorker);
        team.adWorker(secondStrongWorker);
        team.adWorker(simpleWorker);

        team.createSomething();
    }
}
