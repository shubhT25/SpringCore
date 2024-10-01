package com.spring.beans;

public class Branch {
    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        System.out.println("Setting Branch Name");
        this.bname = bname;
    }

    private String bname;
}
