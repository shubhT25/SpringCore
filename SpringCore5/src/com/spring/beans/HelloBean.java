package com.spring.beans;

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

    static {
        System.out.println("HelloBean Class Loading");
    }
    public HelloBean() {
        System.out.println("HelloBean Class Instantiate");
    }
    public void init() {
        System.out.println("Intialize method");
        name = "Kaustubh";
        message = "Good Morning!";
    }
    public void destroy() {
        System.out.println("Delete method");
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
}


