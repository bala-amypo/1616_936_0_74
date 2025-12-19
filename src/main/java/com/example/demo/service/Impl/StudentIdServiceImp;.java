package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.StudentIdService;
import com.example.demo.repository.StudentIdRepository;
import com.example.demo.entity.StudentIdEntity;

@Service
public class StudentIdServiceImpl implements StudentIdService {

    @Autowired
    private StudentIdRepository validoo;

    @Override
    public StudentIdEntity postdata4(StudentIdEntity stu4) {
        return validoo.save(stu4);
    }

    // Keep commented methods fully commented
    /*
    @Override
    public ValidationEntity getbydata(Long id){
        return valid.findById(id)
                .orElseThrow(() -> new ValidationException("Invalid id " + id));
    }
    */
}
