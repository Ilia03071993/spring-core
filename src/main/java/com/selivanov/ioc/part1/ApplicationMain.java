package com.selivanov.ioc.part1;

import com.selivanov.ioc.part1.config.JavaCodeConfig;
import com.selivanov.ioc.part1.bean.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JavaCodeConfig.class);
        Person bean1 = context.getBean(Person.class);
        Person bean2 = context.getBean(Person.class);

        System.out.println(bean1);
        System.out.println(bean2);
    }
}
