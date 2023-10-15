package com.selivanov.dihw.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Window {
    private Integer amount;

    @Autowired

    public Window(@Value("12") Integer amount) {

        this.amount = amount;
    }
}
