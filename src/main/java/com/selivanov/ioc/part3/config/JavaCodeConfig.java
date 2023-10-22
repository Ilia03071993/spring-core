package com.selivanov.ioc.part3.config;

import com.selivanov.ioc.part3.bean.Flyable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//1.
@Configuration
public class JavaCodeConfig {
//    @Bean
//    public Plane plane() {
//        return new Plane();
//    }
//
//    @Bean
//    public Helicopter helicopter() {
//        return new Helicopter();
//    }
//
//    @Bean
//    public Bird bird() {
//        return new Bird();
//    }

    //3.
    @Bean
    public Flyable flyable() {
        return new Flyable() {
            @Override
            public void fly() {

            }
        };
    }
}
