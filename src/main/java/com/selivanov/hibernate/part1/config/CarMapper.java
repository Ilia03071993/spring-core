package com.selivanov.hibernate.part1.config;

import com.selivanov.hibernate.part1.entity.Car;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CarMapper {


    public static void updateModel(Car car, String model){
        car.setModel(model);
    }

    public static void updateOwner(Car car, String owner){
        car.setOwner(owner);
    }

    public static void updatePrice(Car car, BigDecimal price){
        car.setPrice(price);
    }

    public static void updateDate(Car car, LocalDate date){
        car.setDate(date);
    }
}
