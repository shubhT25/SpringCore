package com.spring.app;

import com.spring.beans.HelloBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/resource/applicationContext.xml");
        HelloBean hb1 = (HelloBean) context.getBean("helloBean");
        System.out.println(hb1.sayHello());
        context.close();
    }
}
