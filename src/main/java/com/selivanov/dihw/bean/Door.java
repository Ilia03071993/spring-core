package com.selivanov.dihw.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Door {
    private final String type;

    @Autowired
    public Door(@Value("Hi") String type) {
        this.type = type;
    }
}
