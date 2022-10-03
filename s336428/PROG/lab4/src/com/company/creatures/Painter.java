package com.company.creatures;

import com.company.additionals.Thing;

public class Painter extends Shorty{
    public Painter(String name){
        super(name);
    }
    public Painter(String name, int hp){
        super(name, hp);
    }
    public Thing Paint(String name, String desc){
        Thing a = new Thing(name, desc);
        this.addThing(a);
        System.out.println(this.getName() + " приступает к рисованию картины: " + a.getName());
        System.out.println(this.getName() + " нарисовал настоящий шедевр!");
        System.out.println("Новая картина: " + a.toString());
        return a;
    }
}
