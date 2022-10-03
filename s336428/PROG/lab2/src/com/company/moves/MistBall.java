package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class MistBall extends SpecialMove {
    public MistBall(){
        super(Type.PSYCHIC,70,100);
    }


    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.5).stat(Stat.SPECIAL_ATTACK, -1);
        p.addEffect(e);
    }

    protected String describe() {
        return "hits with Mist Ball";
    }
}
