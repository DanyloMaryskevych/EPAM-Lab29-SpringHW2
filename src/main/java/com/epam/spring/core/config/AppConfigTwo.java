package com.epam.spring.core.config;

import com.epam.spring.core.beans.BeanF;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfigTwo {
    @Bean
    @Lazy
    public BeanF beanF() {
        return new BeanF();
    }
}
