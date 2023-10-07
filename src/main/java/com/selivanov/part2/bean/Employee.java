package com.selivanov.part2.bean;

import jdk.jfr.Name;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//1.
//public class Employee {
//
//    private String name;
//    private int age;
//
//    public Employee(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//}
//2.
//@Component
//public class Employee {
//    private String name = "John";
//    private int age = 30;
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//}

//3.
@Component
@PropertySource("classpath:employee.properties")
public class Employee {
    @Value("${employee.name}")
    private String name;
    @Value("${employee.age}")
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}