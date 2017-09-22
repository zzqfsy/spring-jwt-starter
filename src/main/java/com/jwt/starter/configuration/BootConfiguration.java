package com.jwt.starter.configuration;

import com.jwt.starter.runner.BootRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BootConfiguration {
    @Bean
    public BootRunner getTestRunner(){
        return new BootRunner();
    }
}
