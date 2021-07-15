package com.epam.spring.core.beans;

import com.epam.spring.core.beans.annotations.IntegerValidator;
import com.epam.spring.core.beans.annotations.NameValidator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanC {
    @Value("${beanC.name}")
    @NameValidator
    private String name;

    @Value("${beanC.value}")
    @IntegerValidator
    private int value;

    public BeanC() {
        System.out.println(">> BeanC.Constructor");
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
        return "BeanC{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    private void beanCInit() {
        System.out.println("\t>> BeanC.initMethod()");
    }

    private void beanCDestroy() {
        System.out.println("\t>> BeanC.destroyMethod()");
    }
}
