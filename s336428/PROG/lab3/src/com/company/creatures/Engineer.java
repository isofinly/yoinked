package com.company.creatures;

import com.company.additionals.Thing;

public class Engineer extends Shorty{
    public Engineer(String name){
        super(name);
    }
    public Engineer(String name, int hp){
        super(name, hp);
    }
    public Thing drawBlueprints(String name, String desc){
        Thing a = new Thing(name, desc);
        this.things.add(a);
        System.out.println(this.getName() + " рисует еще один полезный чертеж.");
        System.out.println("Новый чертеж: " + a.toString());
        return a;
    }
}
