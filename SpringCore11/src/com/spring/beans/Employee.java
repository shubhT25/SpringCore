package com.spring.beans;

public class Employee {
    private int eno;
    private String ename;
    private float esal;
    private String eaddr;

    public String getEaddr() {
        return eaddr;
    }

    public void setEaddr(String eaddr) {
        this.eaddr = eaddr;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        System.out.println("In Set number");
        this.eno = eno;
    }

    public float getEsal() {
        return esal;
    }

    public void setEsal(float esal) {
        this.esal = esal;
    }

    public void displayEmpDetails(){
        System.out.println("--------------------------");
        System.out.println("Employee No      :"+eno);
        System.out.println("Employee Name    :"+ename);
        System.out.println("Employee Salary  :"+esal);
        System.out.println("Employee Address :"+eaddr);
    }
}
