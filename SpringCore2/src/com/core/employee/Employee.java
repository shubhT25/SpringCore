package com.core.employee;

public class Employee {
    private int eid;
    private String ename;
    private float esalary;
    private String eaddress;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public float getEsalary() {
        return esalary;
    }

    public void setEsalary(float esalary) {
        this.esalary = esalary;
    }

    public String getEaddress() {
        return eaddress;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress;
    }

    public void empDetails() {
        System.out.println("Employeee Details:");
        System.out.println("-------------------------------------");
        System.out.println("Employee Id: " + this.eid);
        System.out.println("Employee Name: " + this.ename);
        System.out.println("Employee Salary: " + this.esalary);
        System.out.println("Employee Address: " + this.eaddress);
        System.out.println("-------------------------------------");
    }
}
