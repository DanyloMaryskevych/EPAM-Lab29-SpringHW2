package com.epam.spring.core.beans;

import org.springframework.beans.factory.annotation.Value;

public class BeanB {
    @Value("${beanB.name}")
    private String name;

    @Value("${beanB.value}")
    private int value;

    public BeanB() {}

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
        return "BeanB{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
