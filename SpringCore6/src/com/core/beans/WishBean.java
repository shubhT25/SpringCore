package com.core.beans;

public class WishBean {
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
    public void init() {
        System.out.println("Wish init()");
    }
    public String sayWish(){
        return "Wishing " + name + ", " + message;
    }
}
