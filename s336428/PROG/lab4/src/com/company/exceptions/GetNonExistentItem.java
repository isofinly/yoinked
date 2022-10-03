package com.company.exceptions;

public class GetNonExistentItem extends RuntimeException{
    private String massage;

    public GetNonExistentItem(String massage){
        super(massage);
        this.massage = massage;
    }
    public String getMassage(){
        return massage;
    }
}
