package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC,0,100);
    }

    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().condition(Status.SLEEP).turns(2);
        p.addEffect(e);
        Effect ee = new Effect().stat(Stat.HP, (int) (p.getStat(Stat.HP) - p.getHP())).turns(2);
        p.addEffect(ee);
    }

    protected String describe() {
        return "is resting a little...";
    }
}
