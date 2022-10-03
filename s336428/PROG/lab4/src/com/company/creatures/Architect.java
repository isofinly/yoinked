package com.company.creatures;

import com.company.additionals.Thing;

public class Architect extends Shorty{
    public Architect(String name){
        super(name);
    }
    public Architect(String name, int hp){
        super(name, hp);
    }
    public Thing design(String name, String desc){
        Thing a = new Thing(name, desc);
        this.addThing(a);
        System.out.println(this.getName() + " проектирует новое сооружение для жителей города, не мешайте.");
        System.out.println("Новое творение архитектора: " + a.toString());
        return a;
    }
}
