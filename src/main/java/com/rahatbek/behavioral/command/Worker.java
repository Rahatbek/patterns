package com.rahatbek.behavioral.command;

public class Worker {
    Command open;
    Command close;
    Command ride;
    Command stop;

    public Worker(Command open, Command close, Command ride, Command stop) {
        this.open = open;
        this.close = close;
        this.ride = ride;
        this.stop = stop;
    }

    public void openCarDoor() {
        open.execute();
    }

    public void closeCarDoor() {
        close.execute();
    }

    public void rideCar() {
        ride.execute();
    }

    public void stopCar() {
        stop.execute();
    }
}
