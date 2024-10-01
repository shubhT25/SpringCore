package com.spring.controller;

import com.spring.dao.StudentDao;
import com.spring.dao.StudentDaoImpl;
import com.spring.dto.Student;
import com.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Controller("studentController")
public class StudentControllerImpl implements StudentController{

    private BufferedReader br;

    @Autowired
    private StudentService studentService;

    public StudentControllerImpl() {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addStudent() {
        try {
            System.out.println("Student ID: ");
            String sid = br.readLine();
            System.out.println("Student Name: ");
            String sname = br.readLine();
            System.out.println("Student Address");
            String saddr = br.readLine();

            Student std = new Student();
            std.setSid(sid);
            std.setSname(sname);
            std.setSaddr(saddr);

            String status = studentService.addStudent(std);
            if (status.equals("existed")) {
                System.out.println("Account already exist with given ID");
            } else if (status.equals("success")) {
                System.out.println("Account Created Successfully");
            } else {
                System.out.println("System Failure");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void searchStudent() {
        try{
            System.out.println("Enter Student ID: ");
            String sid = br.readLine();

            Student std = new Student();
            std.setSid(sid);
            Student student = studentService.searchStudent(sid);
            if(student == null) {
                System.out.println("Records not found");
            } else {
                System.out.println("Student Id: " + student.getSid());
                System.out.println("Student Name: " + student.getSname());
                System.out.println("Student Address: " + student.getSaddr());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void deleteStudent(String sid) {

    }
}
