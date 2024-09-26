package com.spring.core;

import com.spring.beans.HelloBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/resources/applicationContext.xml");
        HelloBean bean1 = (HelloBean) context.getBean("helloBean1");
        System.out.println(bean1.sayHello());
    }
}
