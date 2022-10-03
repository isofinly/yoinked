package com.company.creatures;

import com.company.additionals.Food;
import com.company.additionals.Spaceship;
import com.company.additionals.Spacesuit;
import com.company.additionals.Thing;

import java.util.ArrayList;
import java.util.Objects;

public class Shorty extends Guys{
    //============
    protected String currentTask = "Пока нет задания";
    private Spacesuit wearedSuit;
    protected ArrayList<Thing> things;
    //============
    public Shorty(String name){
        this.name = name;
        this.curHealth = 100;
        this.things = new ArrayList<>();
    }

    public Shorty(String name, int health){
        this.name = name;
        this.curHealth = health;
        this.things = new ArrayList<>();
    }

    public void heal(int hp){
        if ((this.curHealth + hp) >= this.maxHealth){
            this.curHealth = this.maxHealth;
        }else{
            this.curHealth = this.curHealth + hp;
        };
    }

    protected void getHurt(int hhp){
        this.curHealth = this.curHealth - hhp;
        if (this.curHealth <= 0) System.out.println(this.getName() + " пал в бою.");
    }
    public void damage(Shorty shorty, int hhp){
        System.out.println(this.getName() + " наносит удар! " + shorty.getName() + " теряет здоровье");
        shorty.getHurt(hhp);
    }
    public void wearSuit(Spacesuit suit){
        this.wearedSuit = suit;
        suit.setWeared();
        System.out.println(this.name + " надел(а) космический скафандр");
    }

    public void removeSuit(){
        this.wearedSuit = null;
    }
    public void eat(Food food){
        this.heal(food.getEnergy());
        System.out.println(this.getName() + " употребил в пищу: " + food.getName());
    }
    public void takeTask(String task, Shorty shorty){
        this.currentTask = task;
        System.out.println(shorty.getName() + " дал новое задание: " + task);
    }
    public ArrayList<Thing> getThings(){
        return this.things;
    }
    public void addThing(Thing thing){
        if (things.contains(null)){
            for (int i = 0; i < things.size(); i++){
                if (things.get(i) == null){
                    things.set(i, thing);
                    break;
                }
            }
        } else things.add(thing);
    }
    public void removeThing(Thing thing){
        if (!things.contains(thing)){
            System.out.println("Такого предмета у него и не было");
        }
        else {
            things.set(things.indexOf(thing), null);
        }
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Shorty o1 = (Shorty) o;
        return this.name == o1.name && this.currentTask == o1.currentTask
        && this.isCosmonaut == o1.isCosmonaut;
    }
    public int HashCode() {
        int result = 31;
        result = result * 31 + Objects.hash(name, currentTask);
        result = result * 31 + maxHealth;
        return result;
    }
    public Spacesuit getWearedSuit(){
        return this.wearedSuit;
    }
    public String toString(){
        return ("Коротышка " + this.getName());
    }
}
