package com.selivanov.di;

import com.selivanov.di.bean.Car;
import com.selivanov.di.bean.Cat;
import com.selivanov.di.bean.Person;
import com.selivanov.di.bean.Pet;
import com.selivanov.di.config.AnnotationConfig;
import com.selivanov.di.config.JavaCodeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
      //  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        //Person bean = context.getBean(Person.class);
      //  System.out.println(bean.getPet());
//        Car bean = context.getBean(Car.class);
//        System.out.println(bean);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaCodeConfig.class);
//        Person bean = context.getBean("person",Person.class);
//        Person bean1 = context.getBean("person1",Person.class);
//        System.out.println(bean.getPet());
//        System.out.println(bean1.getPet());
        List<Integer> bean = context.getBean(List.class);
        System.out.println(bean);
    }
}
