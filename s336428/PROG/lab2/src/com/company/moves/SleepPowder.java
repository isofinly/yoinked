package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class SleepPowder extends StatusMove {
    public SleepPowder(){
        super(Type.GRASS,0,75);
    }

    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().turns(1);
        e.sleep(p);
        p.addEffect(e);
    }

    protected String describe() {
        return "trying to lull the enemy with sleep powder";
    }
}
