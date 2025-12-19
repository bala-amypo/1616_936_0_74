package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.StudentIdService;
import com.example.demo.repository.StudentIdRepository;
import com.example.demo.entity.StudentId;

@Service
public class TimeStampServiceImpl implements TimeStampService {

    @Autowired
    private TimeStampRepository valido;

    @Override
    public TimeStamp postdata3(TimeStamp stu2) {
        return valido.save(stu2);
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
