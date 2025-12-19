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
import com.example.demo.service.IdService;
import com.example.demo.entity.IdEntity;
import jakarta.validation.Valid;
@RestController
public class IdController{
    @Autowired IdService ser;  
    @PostMapping("/postttt")
    public IdEntity sendData5(@Valid @RequestBody IdEntity stu5){
        return ser.postdata5(stu5);//to ser calling the service layer
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