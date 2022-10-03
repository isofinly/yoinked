package com.company.creatures;

public abstract class Guys {
    protected String name;
    protected final int maxHealth = 100;
    protected int curHealth;
    protected boolean isCosmonaut = false;

    public String getName(){
        return name;
    }

    public void becomeCosmonaut(){
        this.isCosmonaut = true;
        System.out.println(this.name + " стал(а) космонавтом!");
    }

    public abstract void heal(int hp);
    protected abstract void getHurt(int hhp);

    public int getHealth(){
        return curHealth;
    }

}
