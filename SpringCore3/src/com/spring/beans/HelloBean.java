package com.spring.beans;

public class HelloBean {
    static {
        System.out.println("HelloBean Class Loading");
    }
    public HelloBean(){
        System.out.println("HelloBean Constructor Loading");
    }
    public String sayHello(){
        return "Hello Bean";
    }
}
