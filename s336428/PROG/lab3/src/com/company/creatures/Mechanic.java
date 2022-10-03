package com.company.creatures;

import com.company.additionals.Thing;

public class Mechanic extends Engineer{
    public Mechanic(String name){
        super(name);
    }
    public Mechanic(String name, int hp){
        super(name, hp);
    }
    public Thing TurnGears(String name, String desc){
        Thing a = new Thing(name, desc);
        this.things.add(a);
        System.out.println(this.getName() + " разбирает все вокруг на шестеренки!");
        System.out.println("Новая шестеренка: " + a.toString());
        return a;
    }
}
