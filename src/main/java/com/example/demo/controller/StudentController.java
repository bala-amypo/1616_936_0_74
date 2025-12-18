package com.example.demo.controller;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
@RestController
public class StudentController{
    @Autowired StudentService ser;  
    @PostMapping("/post")
    public StudentEntity sendData(@RequestBody StudentEntity stu){
        return ser.postdata(stu);//to ser calling the service layer
    }
    @GetMapping("/get")
    public List<StudentEntity> getData(){
        return ser.getdata();
    }
    @DeleteMapping("/del/{id}")
    public String delData(@PathVariable Integer id){
        return ser.deldata(id);
    }
    @GetMapping("/putgett/{id}")
    public StudentEntity putData(@PathVariable Integer id){
        return ser.putgetdata(id);
    }
}