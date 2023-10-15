package com.selivanov.di.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Person {
    private Pet pet;

   // @Autowired
    public Person(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }
}