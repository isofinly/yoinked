package com.company.creatures;

import com.company.additionals.Spaceship;
import com.company.additionals.Spacesuit;

public class Constructor extends Shorty{
    public Constructor(String name){
        super(name);
    }
    public Constructor(String name, int hp){
        super(name, hp);
    }

    public Spaceship construct(String shipname, String constName, int maxcrew){
        System.out.println(this.getName() + " сконструировал(а) космический корабль: " + shipname);
        return(new Spaceship(name, constName, maxcrew));
    }
}
