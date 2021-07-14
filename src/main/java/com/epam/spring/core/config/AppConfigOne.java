package com.epam.spring.core.config;

import com.epam.spring.core.beans.BeanB;
import com.epam.spring.core.beans.BeanC;
import com.epam.spring.core.beans.BeanD;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.epam.spring.core.beans")
@PropertySource("classpath:application.properties")
@Import(AppConfigTwo.class)
public class AppConfigOne {
    @Bean
    @DependsOn("beanD")
    public BeanB beanB() {
        return new BeanB();
    }

    @Bean
    @DependsOn("beanB")
    public BeanC beanC() {
        return new BeanC();
    }

    @Bean
    public BeanD beanD() {
        return new BeanD();
    }
}
