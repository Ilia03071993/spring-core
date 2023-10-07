package com.selivanov.part3.config;

import com.selivanov.part3.bean.Bird;
import com.selivanov.part3.bean.Flyable;
import com.selivanov.part3.bean.Helicopter;
import com.selivanov.part3.bean.Plane;
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
