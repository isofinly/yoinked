package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class SilverWind extends SpecialMove{
    public SilverWind(){
        super(Type.BUG, 60, 100);
    }

    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().chance(0.1).stat(Stat.ATTACK, 1).
                stat(Stat.DEFENSE, 1).stat(Stat.SPECIAL_ATTACK, 1).
                stat(Stat.SPECIAL_DEFENSE, 1).stat(Stat.SPEED, 1);
        p.addEffect(e);
    }

    protected String describe(){
        return "hits with Silver Wind";
    }
}
