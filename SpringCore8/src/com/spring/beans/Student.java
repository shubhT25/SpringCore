package com.spring.beans;

public class Student {
    private String sid;
    private String sname;
    private Address address;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void studentDetails() {
        System.out.println("Student Details");
        System.out.println("-------------------------");
        System.out.println("Student Id: " + sid);
        System.out.println("Student Name: " + sname);
        System.out.println("Student Address: " + address.addressDetails());
    }
}
