package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class Rollout extends PhysicalMove {

    private int k = 1;

    public Rollout(){
        super(Type.ROCK,30,90);
    }

    protected void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int) Math.round(damage*k));
        k++;
    }

    @Override
    protected String describe() {
        return "rolls right into the opponent's belly (very painful)";
    }
}
