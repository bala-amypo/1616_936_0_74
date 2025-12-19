package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.TimeStampService;
import com.example.demo.repository.TimeStampRepository;
import com.example.demo.entity.TimeStamp;
// import com.example.demo.exception.ValidationException;

import java.util.List;
@Service
public class TimeStampServiceImpl implements TimeStampService{
   @Autowired TimeStampRepository valido;//  acces the method in diff files
   //save();
   //findall();
   //findById();
   //deleteById();
   //existsById();
   @Override
    public TimeStamp postdata3(TimeStamp stu2){
        return valido.save(stu2);
    }
    // @Override
    // public List<ValidationEntity> getdata(){
    //     return valid.findAll();
    // }
    // @Override
    // public String deldata(Long id){
    //      valid.deleteById(id);
    //      return "Removed successfully";
    // }
    // @Override
    // public ValidationEntity getbydata(Long id){
    //     return valid.findById(id).orElseThrow(()->new ValidationException("Invalid id"+id));    
    }
    // @Override
    // public ValidationEntity putdata(Long id, ValidationEntity std){
    //     if (student.existsById(id)){// checks for the existence of id(true)
    //         std.setId(id);// setting the id
    //         return valid.save(std);//replacing the id
    //     }
    //     else{
    //         return null;
    //     }
    // }
}