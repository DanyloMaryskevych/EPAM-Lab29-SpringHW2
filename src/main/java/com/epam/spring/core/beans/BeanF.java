package com.epam.spring.core.beans;

import com.epam.spring.core.beans.annotations.IntegerValidator;
import com.epam.spring.core.beans.annotations.NameValidator;
import org.springframework.context.annotation.Import;

public class BeanF {
    @NameValidator
    private String name;

    @IntegerValidator
    private int value;

    public BeanF() {
        System.out.println("\t>> BeanF.Constructor");
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
        return "BeanF{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
