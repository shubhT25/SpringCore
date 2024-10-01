package com.spring.service;

import com.spring.dao.StudentDao;
import com.spring.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public String addStudent(Student student) {
        return studentDao.add(student);
    }

    @Override
    public Student searchStudent(String sid) {
        return studentDao.search(sid);
    }

    @Override
    public Student getStudent(String sid) {
        return null;
    }

    @Override
    public String updateStudent(Student student) {
        return "";
    }

    @Override
    public String deleteStudent(String sid) {
        return "";
    }
}
