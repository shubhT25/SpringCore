package com.spring.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloBean implements InitializingBean, DisposableBean {
    private String name, message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("In setName function");
        this.name = name;
    }

    public String getMessage() {
        System.out.println("In getName function");
        return message;
    }

    public void setMessage(String message) {
        System.out.println("In setMessage function");
        this.message = message;
    }

    static {
        System.out.println("HelloBean Class Loading");
    }
    public HelloBean() {
        System.out.println("HelloBean Class Instantiate");
    }
    public void init() {
        System.out.println("Intialize method");
        name = "Kaustubh";
        message = "Good Afternoon!";
    }
    public void destroyCustom() {
        System.out.println("Custom delete method");
        name = "";
        message = "";
    }
    public String sayHello(){
        return "Hello " + this.name + " " + this.message;
    }
    public static HelloBean getInstance(){
        System.out.println("HelloBean Static Factory Method");
        return new HelloBean();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        name = "Arjun";
        message = "Good Evening!";
        System.out.println("In afterPropertieSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("In destroy");
    }

    @PostConstruct
    public void intialize(){
        System.out.println("In PostContruct Init");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("In PreDestroy destroy");
    }
}


