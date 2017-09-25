package com.jwt.starter.configuration;

import com.jwt.starter.properties.RequestMatchersProperties;
import com.jwt.starter.runner.BootRunner;
import com.jwt.starter.security.exception.JwtAuthenticationEntryPoint;
import com.jwt.starter.security.service.JwtUserRulesService;
import com.jwt.starter.security.utils.JwtTokenUtil;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RequestMatchersProperties.class)
@ConditionalOnClass({JwtUserRulesService.class})
public class BootConfiguration {
    @Bean
    public BootRunner getTestRunner(){
        return new BootRunner();
    }

    @Bean
    @ConditionalOnMissingBean(name = "jwtAuthenticationEntryPoint")
    public JwtAuthenticationEntryPoint getJwtAuthenticationEntryPoint(){
        return new JwtAuthenticationEntryPoint();
    }

    @Bean
    @ConditionalOnMissingBean(name = "jwtTokenUtil")
    public JwtTokenUtil jwtTokenUtil(){
        return new JwtTokenUtil();
    }

}
