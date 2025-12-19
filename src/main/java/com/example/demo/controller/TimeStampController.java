package com.example.demo.controller;
// import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.TimeStampService;
import com.example.demo.entity.TimeStamp;
import jakarta.validation.Valid;
@RestController
public class Controller{
    @Autowired ValidationService ser;  
    @PostMapping("/post2")
    public ValidationEntity sendData3(@Valid @RequestBody ValidationEntity stu2){
        return ser.postdata3(stu2);//to ser calling the service layer
    }
    // @GetMapping("/get2")
    // public List<ValidationEntity> getData(){
    //     return ser.getdata();
    // }
    // @DeleteMapping("/del2/{id}")
    // public String delData(@PathVariable Long id){
    //     return ser.deldata(id);
    // }
    // @GetMapping("/putgett2/{id}")
    // public ValidationEntity GetByData(@PathVariable Long id){
    //     return ser.getbydata(id);
    // }
    // @PutMapping("/put2/{id}")
    // public ValidationEntity putData(@PathVariable Long id, @RequestBody ValidationEntity std){
    //     return ser.putdata(id,std); 
    // }
}