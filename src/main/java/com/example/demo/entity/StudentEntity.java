package com.example.demo.entity;
@Entity
public class StudentEntity{
    private Integer id;
    private String username;
    private String email;
    private String password;
    private Date createdAt;

    public void setId(Integer id){
        this.id=id;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setUsername(String username){
        this.username=username;
    }
}