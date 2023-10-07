package com.selivanov.part1.bean;

import org.springframework.stereotype.Component;
//@Scope("prototype")
@Component("people")
public class Person {
    public Person() {
        System.out.println("Person constructor");
    }
    public void say() {
        System.out.println("Hi");
    }
}
