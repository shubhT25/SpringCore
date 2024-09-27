package com.core.beans;

public class HelloBean {
    private String name, message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String sayHello() {
        return "Hello " + name + ", " + message;
    }

    public void init(){
        name="Shubham";
        System.out.println("Hello init");
    }
}