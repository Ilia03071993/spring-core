package com.selivanov.di.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Dog extends Pet{
    private String name;
    public void say() {
        System.out.println("waw-waw");
    }
}
