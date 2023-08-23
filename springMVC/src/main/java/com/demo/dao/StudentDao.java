package com.demo.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.demo.model.Student;


public class StudentDao {
	
	JdbcTemplate jdbcTemplate;

    public void setTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(Student stud){
        String sql = "insert into student_detail values('"+stud.getRegisterNo()+"','"+stud.getStudentName()+"')";
        return jdbcTemplate.update(sql);
    }  

}
