package com.company.additionals;

public class Thing {
    protected String description;
    protected String name;

    public Thing(String name, String desc){
        this.description = desc;
        this.name = name;
    }

    public String getDescription(){
        return this.description;
    }
    public String getName(){ return this.name; };
    public String toString(){ return this.name + ", " + this.description;}

}
