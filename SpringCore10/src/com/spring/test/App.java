package com.spring.test;

import com.spring.controller.StudentController;
import oracle.jdbc.pool.OracleDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/resources/applicationContext.xml");
        StudentController studentController = (StudentController) context.getBean("studentController");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            System.out.println("1. Add");
            System.out.println("2. Search");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.println("Enter options from 1 to 5: ");
            int option = Integer.parseInt(br.readLine());
            switch (option) {
                case 1:
                    studentController.addStudent();
                    break;
                case 2:
                    studentController.searchStudent();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Thank you for using the application");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Option");
                    break;
            }
        }
    }
}