package com.spring.beans;

public class HelloBeanFactory {
    public HelloBean getBeanInstance() {
        System.out.println("Factory Bean Factory Method");
        return new HelloBean();
    }
}
