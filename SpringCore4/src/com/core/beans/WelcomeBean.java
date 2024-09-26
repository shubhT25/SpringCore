package com.core.beans;

import java.awt.event.WindowListener;

public class WelcomeBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    static {
        System.out.println("Welcome Bean Configuring");
    }
    public WelcomeBean(){
        System.out.println("Welcome Bean Contructor");
    }
    public String WelcomeMessage() {
        return "Welcome Bean " + this.name;
    }
}
