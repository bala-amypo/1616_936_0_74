package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class StudentController{
    @Autowired StudentService ser;
    @PostMapping("/post")
}