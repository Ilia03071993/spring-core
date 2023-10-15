package com.selivanov.dihwtask3.config;

import com.selivanov.dihwtask3.bean.JdbcConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@PropertySource("application.properties")
@org.springframework.context.annotation.Configuration
public class JavaCodeConfiguration {
    @Bean("jdbc")
    public JdbcConnection jdbcConnection() {
        return new JdbcConnection();
    }

}
