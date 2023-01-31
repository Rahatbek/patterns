package com.rahatbek.creational.prototype;

public class Car implements CopyAble {
    private int id;
    private String carName;
    private String sourceScheme;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getSourceScheme() {
        return sourceScheme;
    }

    public void setSourceScheme(String sourceScheme) {
        this.sourceScheme = sourceScheme;
    }

    public Car(int id, String carName, String sourceScheme) {
        this.id = id;
        this.carName = carName;
        this.sourceScheme = sourceScheme;
    }

    @Override
    public Object copy() {
        Car copy = new Car(id, carName, sourceScheme);
        return copy;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carName='" + carName + '\'' +
                ", sourceScheme='" + sourceScheme + '\'' +
                '}';
    }
}
