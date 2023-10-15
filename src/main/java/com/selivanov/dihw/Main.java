package com.selivanov.dihw;

import com.selivanov.dihw.bean.Employee;
import com.selivanov.dihw.bean.Material;
import com.selivanov.dihw.bean.Person;
import com.selivanov.dihw.config.AnnotationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //1.
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);

        Person personBean = context.getBean(Person.class);
//        System.out.println(personBean);
        //2.
        Employee employeeBean = context.getBean(Employee.class);
        System.out.println(employeeBean);
    }
}
