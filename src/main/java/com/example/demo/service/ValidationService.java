package com.example.demo.service;
import com.example.demo.entity.ValidationEntity;
import java.util.List;

public interface ValidationService{
    ValidationEntity postdata(ValidationEntity stu);
    List<ValidationEntity> getdata();
    String deldata(Long id);
    ValidationEntity getbydata(Long id);
    ValidationEntity putdata(Long id, ValidationEntity std);
}