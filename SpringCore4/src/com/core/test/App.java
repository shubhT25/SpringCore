package com.core.test;

import com.core.beans.HelloBean;
import com.core.beans.WelcomeBean;
import com.core.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        WelcomeBean welcomeBean1 = (WelcomeBean) context.getBean("welcomeBean");
//        WelcomeBean welcomeBean2 = (WelcomeBean) context.getBean("welcomeBean2");
        HelloBean helloBean1 = (HelloBean) context.getBean("helloBean");
//        HelloBean helloBean2 = (HelloBean) context.getBean(HelloBean.class);
// //       WelcomeBean welcomeBean3 = (WelcomeBean) context.getBean(WelcomeBean.class);
//
        System.out.println(welcomeBean1.WelcomeMessage());
//        System.out.println(welcomeBean2);
        System.out.println(helloBean1.helloMessage());
//        System.out.println(helloBean2);

    }
}
