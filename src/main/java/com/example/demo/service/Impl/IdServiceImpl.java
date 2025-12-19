package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.IdService;
import com.example.demo.repository.IdRepository;
import com.example.demo.entity.IdEntity;

@Service
public class IdServiceImpl implements IdService {

    @Autowired
    private IdRepository validoot;

    @Override
    public IdEntity postdata5(IdEntity stu5) {
        return validoot.save(stu5);
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
