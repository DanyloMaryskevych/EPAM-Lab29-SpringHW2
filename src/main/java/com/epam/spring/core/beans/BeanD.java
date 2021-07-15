package com.epam.spring.core.beans;

import com.epam.spring.core.beans.annotations.IntegerValidator;
import com.epam.spring.core.beans.annotations.NameValidator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanD {
    @Value("${beanD.name}")
    @NameValidator
    private String name;

    @Value("${beanD.value}")
    @IntegerValidator
    private int value;

    public BeanD() {
        System.out.println(">> BeanD.Constructor");
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
        return "BeanD{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    private void beanDInit() {
        System.out.println("\t>> BeanD.initMethod()");
    }

    private void beanDDestroy() {
        System.out.println("\t>> BeanD.destroyMethod()");
    }
}
