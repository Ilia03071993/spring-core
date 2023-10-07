package com.selivanov.part1;

import com.selivanov.part1.bean.Person;
import com.selivanov.part1.config.AnnotationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationAnnotationMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AnnotationConfig.class);

        Person bean1 = context.getBean(Person.class);
        Person person = (Person) context.getBean("people");


        System.out.println(bean1);
        System.out.println(person);
    }
}
