package com.company.additionals;

public class Food {
    private String name;
    private int energy;

    public Food(String name, int energy){
        this.name = name;
        this.energy = energy;
    }
    public String getName(){
        return name;
    }
    public int getEnergy(){
        return energy;
    }
}
