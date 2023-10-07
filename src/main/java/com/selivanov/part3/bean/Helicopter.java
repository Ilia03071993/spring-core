package com.selivanov.part3.bean;

import org.springframework.stereotype.Component;

@Component
public class Helicopter implements Flyable{
    @Override
    public void fly() {
        System.out.println("lets do it helicopter");
    }
}
