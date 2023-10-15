package com.selivanov.di.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@PropertySource("application.properties")
@ComponentScan("com.selivanov.di")
public class AnnotationConfig {
}
