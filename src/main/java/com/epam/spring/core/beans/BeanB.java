package com.epam.spring.core.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    @Value("${beanB.name}")
    private String name;

    @Value("${beanB.value}")
    private int value;

    public BeanB() {
        System.out.println(">> BeanB.Constructor");
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
        return "BeanB{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    private void beanBInit() {
        System.out.println("\t>> BeanB.initMethod()");
    }

    private void initFactoryMethod() {
        System.out.println("\t>> (BeanFactoryPostProcessor) BeanB.initMethod()");
    }

    private void beanBDestroy() {
        System.out.println("\t>> BeanB.destroyMethod()");
    }
}
