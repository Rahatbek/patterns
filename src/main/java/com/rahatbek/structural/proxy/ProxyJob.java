package com.rahatbek.structural.proxy;

public class ProxyJob implements Job{
    private String url;
    private RealJob realJob;

    public ProxyJob(String url) {
        this.url = url;
    }

    @Override
    public void start() {
        if (realJob == null) {
            realJob = new RealJob(url);
        }
        realJob.start();
    }
}
