package com.company.creatures;

import com.company.additionals.Squad;

public class Commander extends Shorty{
    public Commander(String name){
        super(name);
    }
    public Commander(String name, int hp){
        super(name, hp);
    }
    public void giveTask(Shorty shorty, String task){
        shorty.takeTask(task, this);
    }
    public void giveTask(Squad squad, String task){
        squad.takeTask(task, this);
    }
}
