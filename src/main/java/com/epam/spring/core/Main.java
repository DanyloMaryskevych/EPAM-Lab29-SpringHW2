package com.epam.spring.core;

import com.epam.spring.core.config.AppConfigOne;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigOne.class);

        Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
