package com.spring.beans;

public class Student {
    private String sname;
    private Branch branch;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        System.out.println("Setting Student Name");
        this.sname = sname;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        System.out.println("Branch Name In Student");
        this.branch = branch;
    }
}
