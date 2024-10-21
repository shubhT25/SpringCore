package com.spring.controller;

import com.spring.dao.StudentDao;
import com.spring.dao.StudentDaoImpl;
import com.spring.dto.Student;
import com.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

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
            System.out.println("Student Address: ");
            String saddr = br.readLine();

            Student std = new Student();
            std.setSid(sid);
            std.setSname(sname);
            std.setSaddr(saddr);

            String status = studentService.addStudent(std);
            if (status.equals("existed")) {
                System.out.println("Student already exist with given ID");
            } else if (status.equals("success")) {
                System.out.println("Student Created Successfully");
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
    public void updateStudent() {
        try{
            System.out.println("Enter Student ID: ");
            String sid = br.readLine();
            Student student = studentService.searchStudent(sid);
            if(student == null) {
                System.out.println("Student Id not exist");
            } else {
                System.out.println("Student Old Name: " + student.getSname() + " New Name: ");
                String sname = br.readLine();
                System.out.println("Student Old Address: " + student.getSname() + " New Address: ");
                String saddress = br.readLine();
                Student updatedStudent = new Student();
                updatedStudent.setSid(sid);
                updatedStudent.setSname(sname);
                updatedStudent.setSaddr(saddress);
                String res = studentService.updateStudent(updatedStudent);
                if(Objects.equals(res, "Success")) {
                    System.out.println("Student Successfully Updated");
                } else {
                    System.out.println("Operation Failed");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteStudent() {
        try{
            System.out.println("Enter Student Id: ");
            String sid = br.readLine();
            Student student = studentService.searchStudent(sid);
            if(student == null) {
                System.out.println("Student does not exist");
            } else {
                String res = studentService.deleteStudent(sid);
                if(res == "Success") {
                    System.out.println("Record deleted Succesfully");
                } else {
                    System.out.println("Operation Failed");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
