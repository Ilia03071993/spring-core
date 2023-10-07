package com.selivanov.part3.bean;

import org.springframework.stereotype.Component;

@Component
public class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("lets do it plane");
    }

}
