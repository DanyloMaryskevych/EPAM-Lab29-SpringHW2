package com.epam.spring.core.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.epam.spring.core.beans")
@PropertySource("classpath:application.properties")
@Import(AppConfigTwo.class)
public class AppConfigOne {

}
