package com.company.exceptions;

public class ExceedingTheMaxCapacity extends Exception{
    private String massage;
    public ExceedingTheMaxCapacity(String massage){
        super(massage);
    }
    public String getMassage(){
        return massage;
    }
}
