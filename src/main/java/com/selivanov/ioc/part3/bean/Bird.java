package com.selivanov.ioc.part3.bean;

import org.springframework.stereotype.Component;

@Component
public class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("lets do it bird");
    }
}
