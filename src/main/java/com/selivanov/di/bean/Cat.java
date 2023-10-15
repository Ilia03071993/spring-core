package com.selivanov.di.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Cat extends Pet {
    private String name;
    public void say() {
        System.out.println("frr");
    }
}
