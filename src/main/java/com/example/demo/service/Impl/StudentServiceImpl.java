package com.example.dom.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
   @Autowired StudentRepository student;//
   //save(), findall(),findById(),deleteById(),existsById();
   public StudentEntity postdata(StudentEntity stu){
    
   }

}