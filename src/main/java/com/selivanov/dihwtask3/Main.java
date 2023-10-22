package com.selivanov.dihwtask3;

import com.selivanov.dihwtask3.bean.Car;
import com.selivanov.dihwtask3.bean.JdbcConnection;

import com.selivanov.dihwtask3.config.AnnotationConfig;
import com.selivanov.dihwtask3.config.JavaCodeConfiguration;
import com.selivanov.dihwtask3.repository.CarRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BigDecimal decimal = new BigDecimal("12000.00");
        LocalDate date = LocalDate.of(2013,7,18);
       // System.out.println(date);
        Car car = new Car(null,"nissan","Jake",decimal,date);
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(JavaCodeConfiguration.class);
        JdbcConnection jdbc =(JdbcConnection) context1.getBean("jdbc");

        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        CarRepository bean = context2.getBean(CarRepository.class);
//        bean.addCar(car);
        System.out.println(bean.findAllCars());
    }
}
