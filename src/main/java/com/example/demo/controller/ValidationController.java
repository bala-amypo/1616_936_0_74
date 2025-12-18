package com.example.demo.controller;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.ValidationService;
import com.example.demo.entity.ValidationEntity;
@RestController
public class ValidationController{
    @Autowired ValidationService ser;  
    @PostMapping("/post")
    public ValidationEntity sendData(@RequestBody ValidationEntity stu){
        return ser.postdata(stu);//to ser calling the service layer
    }
    @GetMapping("/get")
    public List<ValidationEntity> getData(){
        return ser.getdata();
    }
    @DeleteMapping("/del/{id}")
    public String delData(@PathVariable Integer id){
        return ser.deldata(id);
    }
    @GetMapping("/putgett/{id}")
    public StudentEntity GetByData(@PathVariable Integer id){
        return ser.getbydata(id);
    }
    @PutMapping("/put/{id}")
    public StudentEntity putData(@PathVariable Integer id, @RequestBody StudentEntity std){
        return ser.putdata(id,std);
    }
}