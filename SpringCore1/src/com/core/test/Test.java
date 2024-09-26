package com.core.test;

import com.core.hello.HelloBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) throws Exception{
        System.out.println("Before context");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Before getbean");
        HelloBean hello = (HelloBean) context.getBean("helloBean");
        System.out.println(hello.sayHello());
    }
}
