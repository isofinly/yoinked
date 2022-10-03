package com.company.creatures;

public class Doctor extends Shorty{
    public Doctor(String name){
        super(name);
    }
    public Doctor(String name, int hp){
        super(name, hp);
    }
    public void Heal(Shorty shorty){
        shorty.curHealth = shorty.maxHealth;
        System.out.println(this.getName() + " лечит своего друга, " + shorty.getName() + " восстанавливает здоровье");
    }
}
