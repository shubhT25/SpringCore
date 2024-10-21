package com.spring.postProcessor;

import com.spring.beans.HelloBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class HelloPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        HelloBean hb = (HelloBean) bean;
        System.out.println("PostProcessBeforeInitialization");
        return hb;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        HelloBean hb = (HelloBean) bean;
        hb.setName("Aniket");
        System.out.println("PostProcessAfterInitialization");
        return hb;
    }
}
