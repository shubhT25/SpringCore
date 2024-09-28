package com.spring.test;

import com.spring.beans.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/resource/applicationContext.xml");
        Course c1 = (Course) context.getBean("courseBean");
        c1.courseDetails();
    }
}
