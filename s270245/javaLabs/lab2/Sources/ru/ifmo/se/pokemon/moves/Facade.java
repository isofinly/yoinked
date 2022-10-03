package ru.ifmo.se.pokemon.moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {

    public Facade()
    {
        super(Type.NORMAL, 70, 1);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        Status condition = pokemon.getCondition();
        if (condition == Status.PARALYZE || condition == Status.BURN || condition == Status.POISON)
            super.applyOppDamage(pokemon, v * 2);
        else
            super.applyOppDamage(pokemon, v);
    }

    @Override
    protected String describe() {
        return "использует Facade";
    }
}
