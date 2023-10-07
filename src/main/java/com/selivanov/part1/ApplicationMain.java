package com.selivanov.part1;

import com.selivanov.part2.bean.Employee;
import com.selivanov.part1.bean.Person;
import com.selivanov.part1.config.JavaCodeConfig;
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
