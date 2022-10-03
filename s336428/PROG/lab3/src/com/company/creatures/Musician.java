package com.company.creatures;

import com.company.additionals.Thing;

public class Musician extends Shorty{
    public Musician(String name){
        super(name);
    }
    public Musician(String name, int hp){
        super(name, hp);
    }
    public Thing playMusic(String name, String desc){
        Thing a = new Thing(name, desc);
        this.things.add(a);
        System.out.println(this.getName() + " начинает играть: " + a.toString());
        System.out.println(a.getName() + " звучит великолепно в исполнении " + this.getName() + "!");
        return a;
    }
}
