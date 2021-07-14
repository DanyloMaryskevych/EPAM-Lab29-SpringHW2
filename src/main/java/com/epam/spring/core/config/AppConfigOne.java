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
    @Bean(initMethod = "beanBInit", destroyMethod = "beanBDestroy")
    @DependsOn("beanD")
    public BeanB beanB() {
        return new BeanB();
    }

    @Bean(initMethod = "beanCInit", destroyMethod = "beanCDestroy")
    @DependsOn("beanB")
    public BeanC beanC() {
        return new BeanC();
    }

    @Bean(initMethod = "beanDInit", destroyMethod = "beanDDestroy")
    public BeanD beanD() {
        return new BeanD();
    }
}
