package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2,max=8,message="Must range from 2 to 8 characters")
    private String username;
    @Email(message="Email is not valid")
    private String email;
    @Size(min=2,max=8,message="Must range from 2 to 8 characters")
    @NotNull(message="password is mandatory")
    private String password;
    @Min(18)
    @Positive
    @NotNull(message="Age is mandatory")
    private int age; 
     public void setId(Long id){
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
    public void setAge(int age){
        this.age=age;
    }
    public Long getId(){
        return id;
    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
   
    public Date getAge(){
        return age;
    }
    public ValidationEntity(Long id,@NotNull @Size(min=2,max=8,message="Must range from 2 to 8 characters")
    String username,@Email(message="Email is not valid") String email,
    @Size(min=2,max=8,message="Must range from 2 to 8 characters") @NotNull(message="password is mandatory")String password,
    @Min(18) @Positive @NotNull(message="Age is mandatory") int age){
        this.username=username;
        this.email=email;
        this.password=password;
        this.createdAt=createdAt;
    }
    public ValidationEntity(){

    }

}