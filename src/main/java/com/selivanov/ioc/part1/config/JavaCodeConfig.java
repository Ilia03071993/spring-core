package com.selivanov.ioc.part1.config;

import com.selivanov.ioc.part1.bean.Person;
import org.springframework.context.annotation.Bean;

public class JavaCodeConfig {
    @Bean
    public Person person() {
        return new Person();
    }
}