package com.example.dom.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.repository.StudentRepository;
import com.example.demo.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;

@Service

public class StudentServiceImpl implements StudentService{
   @Autowired StudentRepository student;//to access the methods in diff file
   //save(), findAll(),findById(),deleteById(),existsById();
   @Override
   public StudentEntity postdata(StudentEntity stu){
    return student.save(stu); //stu->userinput save->insert and update
   }

}