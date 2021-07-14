package com.epam.spring.core.beans;

import org.springframework.beans.factory.annotation.Value;

public class BeanC {
    @Value("${beanC.name}")
    private String name;

    @Value("${beanC.value}")
    private int value;

    public BeanC() {}

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
        return "BeanC{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
