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
    public void setCreatedAt(Date createdAt){
        this.createdAt=createdAt;
    }
    public Integer getId{
        return this.id;
    }
    public String getUsername{
        return this.username;
    }
    public String getEmail{
        return this.email;
    }
    public String getPassword{
        return this.password;
    }
    public Date getCreatedAt{
        return this.createdAt;
    }
    public 

}