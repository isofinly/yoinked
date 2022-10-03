package com.company.additionals;

public class Spacesuit extends Thing{
    private int strength;
    private boolean isWeared = false;

    public Spacesuit(String name, String desc){
        super(name, desc);
        this.strength = 55;
    }

    public Spacesuit(String name, String desc, int str){
        super(name, desc);
        this.strength = str;
    }

    public void setWeared(){
        this.isWeared = true;
    }

    public void setUnweared(){
        this.isWeared = false;
    }


    public String getDescription(){
        return this.description;
    }

    public String toString(){
        return this.getDescription();
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Spacesuit o1 = (Spacesuit) o;
        return this.description == o1.description && this.strength == o1.strength;
    }
}
