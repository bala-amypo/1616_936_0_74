package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.ValidationService;
import com.example.demo.repository.ValidationRepository;
import com.example.demo.entity.ValidationEntity;
import java.util.List;
@Service
public class ValidationServiceImpl implements ValidationService{
   @Autowired ValidationRepository valid;//  acces the method in diff files
   //save();
   //findall();
   //findById();
   //deleteById();
   //existsById();
   @Override
    public ValidationEntity postdata(ValidationEntity stu){
        return valid.save(stu);
    }
    @Override
    public List<ValidationEntity> getdata(){
        return valid.findAll();
    }
    @Override
    public String deldata(Long id){
         valid.deleteById(id);
         return "Removed successfully";
    }
    @Override
    public ValidationEntity getbydata(Long id){
        return valid.findById(id).orElse(null);    
    }
    @Override
    public ValidationEntity putdata(Long id, ValidationEntity std){
        if (student.existsById(id)){// checks for the existence of id(true)
            std.setId(id);// setting the id
            return valid.save(std);//replacing the id
        }
        else{
            return null;
        }
    }
}