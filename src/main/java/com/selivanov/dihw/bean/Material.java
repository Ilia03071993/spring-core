package com.selivanov.dihw.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Material {
    private String name;

    @Autowired
    public Material(@Value("Axe") String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
