package com.epam.spring.core.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanE {
    private String name;
    private int value;

    public BeanE() {}

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
        return "BeanE{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    @PostConstruct
    public void afterInitMethod() {
        System.out.println("\t>> BeanE: inside @PostConstruct method");
    }

    @PreDestroy
    public void beforeDestructionMethod() {
        System.out.println("\t>> BeanE: inside @PreDestroy method");
    }
}
