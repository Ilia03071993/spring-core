package com.selivanov.di.config;

import com.selivanov.di.bean.Cat;
import com.selivanov.di.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@PropertySource("application.properties")
@ComponentScan("com.selivanov.di")
//@Configuration
public class JavaCodeConfig {
    @Bean
    public Person person(Cat cat) {
        return new Person(cat);
    }
    @Bean
    public Person person1(Cat cat) {
        return new Person(cat);
    }
    @Bean
    public Cat cat() {
        return new Cat();
    }

    @Bean
    public List<Integer> list(){
        return new ArrayList<>();
    }
}
