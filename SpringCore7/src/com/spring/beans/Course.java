package com.spring.beans;

public class Course {
    private int cid;
    private String cname;
    private float ccost;

    public Course(int id, String name, float cost){
        this.cid = id;
        this.cname = name;
        this.ccost = cost;
    }

//    public Course(){
//        System.out.println("Default Constructor");
//    }
//
//    public Course(int cid, float ccost) {
//        this.cid = cid;
//        this.ccost = ccost;
//    }
//
//    public Course(float ccost, int cid) {
//        this.cid = cid;
//        this.ccost = ccost;
//    }
//    public String getCname() {
//        return cname;
//    }
//
//    public void setCname(String cname) {
//        this.cname = cname;
//    }
//
//    public int getCid() {
//        return cid;
//    }
//
//    public void setCid(int cid) {
//        this.cid = cid;
//    }
//
//    public float getCcost() {
//        return ccost;
//    }
//
//    public void setCcost(float ccost) {
//        this.ccost = ccost;
//    }

    public void courseDetails() {
        System.out.println("Course Details");
        System.out.println("---------------------------");
        System.out.println("Course Id: " + cid);
        System.out.println("Course Name: " + cname);
        System.out.println("Course Details: " + ccost);
        System.out.println("---------------------------");
    }
}
