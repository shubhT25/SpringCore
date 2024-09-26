package com.spring.app;

import com.spring.beans.HelloBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/resource/applicationContext.xml");
        HelloBean hb1 = (HelloBean) context.getBean("helloBean");
        hb1.sayHello();
    }
}
