package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class JumpKick extends PhysicalMove {

    private boolean acc_f;

    public JumpKick(){
        super(Type.FIGHTING,100,95);
    }

    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        if ((accuracy * att.getStat(Stat.ACCURACY) / def.getStat(Stat.EVASION)) > Math.random()){
            acc_f = true;
        } else{acc_f = false;}
        return acc_f;
    }

    protected void applySelfDamage(Pokemon att, double damage){
        if (acc_f == false){
            att.setMod(Stat.HP, (int) Math.round(att.getHP() / 2));
        }
    }

    protected String describe() {
        if (acc_f)return "hits an opponent in a jump";
        return "misses and brakes his leg (loses half of his health)";
    }
}
