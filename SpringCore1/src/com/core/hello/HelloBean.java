package com.core.hello;

public class HelloBean {
    private String name;

    public String getName() {
        System.out.println("Setname called");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello(){
        return "Hello " + name;
    }
}
