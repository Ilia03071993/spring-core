package com.selivanov.dihwtask3;

import com.selivanov.dihwtask3.bean.Car;
import com.selivanov.dihwtask3.bean.JdbcConnection;

import com.selivanov.dihwtask3.config.AnnotationConfig;
import com.selivanov.dihwtask3.config.JavaCodeConfiguration;
import com.selivanov.dihwtask3.repository.CarRepository;
import com.selivanov.part3.config.JavaCodeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        BigDecimal decimal = new BigDecimal("2000.23");
        Date date = new Date(1993-10-25);
        Car car = new Car(null,"kia","Jack",decimal,date);
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(JavaCodeConfiguration.class);
        JdbcConnection jdbc =(JdbcConnection) context1.getBean("jdbc");

        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        CarRepository bean = context2.getBean(CarRepository.class);
       bean.addCar(car);
//        jdbc.destroy();
    }
}
