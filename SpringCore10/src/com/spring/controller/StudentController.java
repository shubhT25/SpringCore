package com.spring.controller;

import com.spring.dto.Student;

public interface StudentController {
    public void addStudent();
    public void searchStudent();
    public void updateStudent(Student student);
    public void deleteStudent(String sid);
}
