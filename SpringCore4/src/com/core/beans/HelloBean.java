package com.core.beans;

public class HelloBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static {
        System.out.println("Hello Bean Configuring");
    }
    public HelloBean(){
        System.out.println("Hello Bean Contructor");
    }

    public String helloMessage(){
        return "Hello Bean " + this.name;
    }
}
