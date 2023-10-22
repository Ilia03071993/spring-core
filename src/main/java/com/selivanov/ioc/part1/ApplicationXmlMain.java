package com.selivanov.ioc.part1;

import com.selivanov.ioc.part1.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationXmlMain {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");
//How work spring
//        try {
//            Class<?> aClass = Class.forName("com.selivanov.part1.bean.Person");
//            Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
//            Person o = (Person) declaredConstructor.newInstance();
//            o.say();
//        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | IllegalAccessException |
//                 InstantiationException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("after context");
        Person bean1 = context.getBean(Person.class);
        Person bean2 = (Person) context.getBean("people");

        System.out.println(bean1);
        System.out.println(bean2);
    }
}