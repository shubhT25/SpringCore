package com.spring.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloBean implements InitializingBean, DisposableBean {
    private String name, message;

    static {
        System.out.println("HelloBean Class Loading");
    }

    public HelloBean() {
        System.out.println("HelloBean Class Instantiate");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting Name");
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("Setting message");
        this.message = message;
    }

    public void initCustom() {
        System.out.println("Custom initialize method");
        name = "Kaustubh";
        message = "Good Afternoon!";
    }
    public void destroyCustom() {
        System.out.println("Custom delete method");
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
        System.out.println("afterPropertiesSet Method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy method from Disposable Bean");
    }

    @PostConstruct
    public void intialize(){
        System.out.println("Init method by PostConstruct Annotation");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Destroy method by PreDestroy Annotation");
    }
}


