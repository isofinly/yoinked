package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class CometPunch extends PhysicalMove {
    public CometPunch(){
        super(Type.NORMAL, 18, 85);
    }
    protected void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int) Math.round(damage));
        if (Math.random()>0.625) {
            def.setMod(Stat.HP, (int) Math.round(damage * 2));
            if (Math.random()>0.625){
                def.setMod(Stat.HP, (int) Math.round(damage * 3));
                if (Math.random()>0.875){
                    def.setMod(Stat.HP, (int) Math.round(damage * 4));
                    if (Math.random()>0.875){
                        def.setMod(Stat.HP, (int) Math.round(damage * 5));
                    }
                }
            }
        }
    }

    protected String describe(){
        return "brings down a COMET to an opponent";
    }
}
