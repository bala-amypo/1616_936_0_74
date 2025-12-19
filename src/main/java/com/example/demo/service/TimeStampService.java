package com.example.demo.service;
import com.example.demo.entity.TimeStamp;
import java.util.List;

public interface TimeStampService{
    TimeStamp postdata2(ValidationEntity stu);
    // List<ValidationEntity> getdata();
    // String deldata(Long id);
    ValidationEntity getbydata(Long id);
    // ValidationEntity putdata(Long id, ValidationEntity std);
}