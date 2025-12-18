package com.example.demo.service;
import com.example.demo.entity.StudentEntity;
import java.util.List;

public interface StudentService{
    StudentEntity postdata(StudentEntity stu);
    List<StudentEntity> getdata();
    String deldata(Integer id);
    StudentEntity getbydata(Integer id);
}