package com.rahatbek.structural.adapter;

public class CarRunner {
    public static void main(String[] args) {
        CarState carState = new AdapterCarToState();

        carState.open();
        carState.close();
        carState.ride();
        carState.stop();
    }
}
