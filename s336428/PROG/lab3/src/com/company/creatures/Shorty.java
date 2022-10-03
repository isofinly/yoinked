package com.company.creatures;

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
        this.things = new ArrayList<>(5);
    }

    public Shorty(String name, int health){
        this.name = name;
        this.curHealth = health;
        this.things = new ArrayList<>(5);
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

    public void takeTask(String task, Shorty shorty){
        this.currentTask = task;
        System.out.println(shorty.getName() + " дал новое задание: " + task);
    }
    public ArrayList<Thing> getThings(){
        return this.things;
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
    public String toString(){
        return ("Коротышка " + this.getName());
    }
}
