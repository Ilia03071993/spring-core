package com.selivanov.di.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Value("${car.model}")
    private String model;
    @Value("${car.car-speed}")
    private Double carSpeed;

    public String getModel() {
        return model;
    }

    public Double getCarSpeed() {
        return carSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", carSpeed=" + carSpeed +
                '}';
    }
}
