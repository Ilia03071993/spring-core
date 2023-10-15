package com.selivanov.dihw.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private Pet pet;
    private House house;

    @Autowired
    public Person(House house,Pet pet)

    {
        this.house = house;
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public House getHouse() {
        return house;
    }

}
