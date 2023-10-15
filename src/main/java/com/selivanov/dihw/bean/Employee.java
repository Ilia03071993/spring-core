package com.selivanov.dihw.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private Pet pet;
    private Job job;

    @Autowired
    public Employee(Pet pet, Job job) {
        this.pet = pet;
        this.job = job;
    }
}
