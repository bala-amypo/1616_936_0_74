package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
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
    @Max(6)
    @NotNull(message="password is mandatory")
    private String password;
    @Min(18)
    @Positive
    @NotNull(message="Age is mandatory")
    private Integer age; 
}