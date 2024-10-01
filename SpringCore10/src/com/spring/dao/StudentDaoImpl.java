package com.spring.dao;

import com.spring.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//@Component("studentDao")
@Repository("studentDao")
public class StudentDaoImpl implements StudentDao{

    @Autowired
    private DataSource dataSource;

    @Override
    public String add(Student student) {
        String status = "";
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement pst = conn.prepareStatement("select * from Student where SID=?");
            pst.setString(1, student.getSid());
            ResultSet rs = pst.executeQuery();
            boolean b = rs.next();
            if(b){
                status="existed";
            } else {
                pst = conn.prepareStatement("insert into Student values(?, ?, ?)");
                pst.setString(1, student.getSid());
                pst.setString(2, student.getSname());
                pst.setString(3, student.getSaddr());
                int rowCount = pst.executeUpdate();
                if(rowCount == 1) {
                    System.out.println("In success");
                    status = "success";
                } else {
                    System.out.println("In failure");
                    status = "failed";
                }
            }
        } catch (Exception e) {
            status="failed";
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public Student search(String sid) {
        try{
            Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement("select * from Student where sid=?");
            ps.setString(1, sid);
            ResultSet rs = ps.executeQuery();
            boolean b = rs.next();
            if(b) {
                Student std = new Student();
                std.setSid(rs.getString("SID"));
                std.setSname(rs.getString("SNAME"));
                std.setSaddr(rs.getString("SADDR"));
                return std;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String update(Student student) {
        return "";
    }

    @Override
    public String delete(String sid) {
        return "";
    }
}
