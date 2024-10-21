package com.spring.beans;

import com.spring.factory.CourseFactory;

public class Student{
    private String sid;
    private String sname;
    private CourseFactory courseFactory;

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

    public CourseFactory getCourseFactory() {
        return courseFactory;
    }

    public void setCourseFactory(CourseFactory courseFactory) {
        this.courseFactory = courseFactory;
    }

    public Course getCourse() {
        return null; // Default behavior, but this will be replaced by MethodReplacer
    }
}
