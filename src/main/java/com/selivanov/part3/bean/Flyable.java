package com.selivanov.part3.bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public interface Flyable {
    void fly();
}
