package com.jwt.starter.configuration;

import com.jwt.starter.properties.RequestMatchersProperties;
import com.jwt.starter.runner.BootRunner;
import com.jwt.starter.security.service.JwtUserRulesService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableConfigurationProperties(RequestMatchersProperties.class)
@ConditionalOnClass({JwtUserRulesService.class})
@ComponentScan( basePackages = "com.jwt.starter.security",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = RestController.class),
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Component.class),
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Service.class)})
public class BootConfiguration {
    @Bean
    public BootRunner getTestRunner(){
        return new BootRunner();
    }
}
