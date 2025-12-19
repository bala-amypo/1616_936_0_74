package com.example.dom.exception;
public class ValidationException extends RuntimeException(){
    public ValidationException(String message){
        super(message);
    }
}