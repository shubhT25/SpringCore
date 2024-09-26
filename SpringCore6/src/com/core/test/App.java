package com.core.test;

import com.core.beans.HelloBean;
import com.core.beans.WelcomeBean;
import com.core.beans.WishBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/core/resource/applicationContext.xml");
        HelloBean hb = (HelloBean) context.getBean("helloBean");
        WelcomeBean wb = (WelcomeBean) context.getBean("welcomeBean");
        WishBean wib = (WishBean) context.getBean("wishBean");
        System.out.println(hb.sayHello());
        System.out.println(wb.sayWelcome());
        System.out.println(wib.sayWish());
    }
}
