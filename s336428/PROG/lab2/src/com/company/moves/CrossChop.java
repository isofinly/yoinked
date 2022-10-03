package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class CrossChop extends PhysicalMove {
    public CrossChop(){
        super(Type.FIGHTING, 100, 80);
    }

    protected void applyOppDamage(Pokemon def, double damage){
        if (Math.random()>0.875){
            def.setMod(Stat.HP, (int) Math.round(2*damage));
        }
        else def.setMod(Stat.HP, (int) Math.round(damage));
    }

    protected String describe() {
        return "uses CROSS CHOP";
    }
}
