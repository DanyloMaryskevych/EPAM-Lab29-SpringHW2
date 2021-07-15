package com.epam.spring.core.beans.annotations;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

import static com.epam.spring.core.beans.annotations.IntegerValidatorAnnotationBeanPostProcessor.getFieldValue;

@Component
public class NameValidatorAnnotationBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            NameValidator annotation = field.getAnnotation(NameValidator.class);
            if (annotation != null) {
                field.setAccessible(true);
                String name = (String) getFieldValue(field, bean);

                if (name == null) {
                    System.out.println("\t\t\t BAD NAME (" + name + ") FOR BEAN '" + beanName + "'! BEAN IS INVALID");
                }
            }
        }
        return bean;
    }
}
