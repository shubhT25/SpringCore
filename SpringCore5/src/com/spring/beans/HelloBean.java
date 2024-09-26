package com.spring.beans;

public class HelloBean {
    static {
        System.out.println("HelloBean Class Loading");
    }
    public HelloBean() {
        System.out.println("HelloBean Class Instantiate");
    }
    public String sayHello(){
        return "Hello Beans";
    }
}


