package com.epam.spring.core.beans.annotations;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
public class IntegerValidatorAnnotationBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            IntegerValidator annotation = field.getAnnotation(IntegerValidator.class);
            if (annotation != null) {
                field.setAccessible(true);
                int value = (Integer) getFieldValue(field, bean);

                if (value < annotation.min() || value > annotation.max()) {
                    System.out.println("\t\t\t BAD VALUE (" + value + ") FOR BEAN '" + beanName + "'! BEAN IS INVALID");
                }
            }

        }
        return bean;
    }

    public static Object getFieldValue(Field field, Object obj) {
        Object object = null;
        try {
            object = field.get(obj);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return object;
    }
}
