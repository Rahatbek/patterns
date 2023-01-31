package com.rahatbek.creational.builder;

import java.lang.reflect.Type;

public class Car {
    private String name;
    private TypeCar type;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(TypeCar type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", price=" + price +
                '}';
    }
}
