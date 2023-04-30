package com.petrovasyliev.spring.rest.exceptionhandling;

public class NoSuchEmployeeException extends RuntimeException{

    public NoSuchEmployeeException(String message){
        super(message);
    }
}
