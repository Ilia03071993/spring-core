package com.selivanov.part1.config;

import com.selivanov.part1.bean.Person;
import org.springframework.context.annotation.Bean;

public class JavaCodeConfig {
    @Bean
    public Person person() {
        return new Person();
    }
}