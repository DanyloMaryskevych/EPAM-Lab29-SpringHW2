package com.epam.spring.core;

import com.epam.spring.core.config.AppConfigOne;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("\t\t ***** Start Bean Initialization *****");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigOne.class);
        System.out.println("\t\t ***** End Bean Initialization *****\n");

        Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println("\n\t\t ***** Bean Destruction *****");
        context.close();
    }
}
