package ru.ifmo.se.pokemon.moves;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove
{
    public ChargeBeam()
    {
        super(Type.ELECTRIC, 50, 0.9);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (0.7D > Math.random())
            pokemon.setMod(Stat.SPECIAL_ATTACK, 1);
    }

    @Override
    protected String describe() {
        return "использует Charge Beam";
    }
}
