package com.spring.app;

import com.spring.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/resources/applicationContext.xml");
        Student s1 = (Student) context.getBean("studentBean");
        s1.studentDetails();
    }
}
