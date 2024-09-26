package com.core.beans;

public class WelcomeBean {
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

    public String sayWelcome(){
        return "Welcome " + name + ", " + message;
    }
}
