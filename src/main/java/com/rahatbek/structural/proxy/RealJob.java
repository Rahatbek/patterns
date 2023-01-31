package com.rahatbek.structural.proxy;

public class RealJob implements Job{

    private String url;

    public RealJob(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("Loading job from: " + url + ".");
    }

    @Override
    public void start() {
        System.out.println("Staring job " + url + ".");
    }
}
