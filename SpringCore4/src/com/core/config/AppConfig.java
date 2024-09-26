package com.core.config;

import com.core.beans.HelloBean;
import com.core.beans.WelcomeBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public WelcomeBean welcomeBean() {
        WelcomeBean welcomeBean = new WelcomeBean();
        welcomeBean.setName("Here");
        return welcomeBean;
    }
//    @Bean
//    public WelcomeBean welcomeBean2() {
//        return new WelcomeBean();
//    }
    @Bean
    public HelloBean helloBean() {
        HelloBean helloBean = new HelloBean();
        helloBean.setName("There");
        return helloBean;
    }
}
