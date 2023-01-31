package com.rahatbek.structural.proxy;

public class JobRunner {
    public static void main(String[] args) {
        Job job = new ProxyJob("https://www.job.kg/jobs/realJob");

        job.start();
    }
}
