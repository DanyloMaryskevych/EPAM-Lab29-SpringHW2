package com.epam.spring.core.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanA implements InitializingBean, DisposableBean {
    private String name;
    private int value;

    public BeanA() {
        System.out.println(">> BeanA.Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

/*
    The afterPropertiesSet or @PostConstruct annotated method
    is called after an instance of class
    is created and all the properties have been set.
*/
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("\t>> BeanA: inside afterPropertiesSet() method.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("\t>> BeanA: inside destroy() method.");
    }
}
