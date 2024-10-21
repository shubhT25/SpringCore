package com.spring.test;

import com.spring.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/resources/applicationContext.xml");
        Student std1 = (Student) context.getBean("studentBean");

        Student std2 = (Student) context.getBean("studentBean");

        System.out.println(std1);
        System.out.println(std2);
        System.out.println(std1.getCourse());
        System.out.println(std2.getCourse());
        System.out.println(std1.getCourseFactory());
        System.out.println(std2.getCourseFactory());

    }
}

