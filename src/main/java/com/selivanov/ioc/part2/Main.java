package com.selivanov.ioc.part2;

import com.selivanov.ioc.part2.bean.Employee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //1
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaCodeConfig.class);
//        Employee bean = context.getBean(Employee.class);
//        System.out.println(bean.getAge());
//        System.out.println(bean.getName());
        //2
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Employee.class);
//        Employee employee = context.getBean(Employee.class);
//        System.out.println(employee.getName());
//        System.out.println(employee.getAge());
        //3
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Employee.class);
        Employee bean = context.getBean(Employee.class);
        System.out.println(bean.getAge());
        System.out.println(bean.getName());
    }
}
