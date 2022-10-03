package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class GyroBall extends PhysicalMove {

    private double att_speed = 1;

    public GyroBall(){
        super(Type.STEEL,25,100);
    }

    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        att_speed = att.getStat(Stat.SPEED);
        return (accuracy * att.getStat(Stat.ACCURACY) / def.getStat(Stat.EVASION)) > Math.random();
    }

    protected void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int) Math.round(damage * def.getStat(Stat.SPEED) / att_speed));
    }

    protected String describe() {
        return "hits with Gyro Ball";
    }
}
