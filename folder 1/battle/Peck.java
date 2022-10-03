package ru.ifmo.se.pokemon.moves;

import ru.ifmo.se.pokemon.*;

public class Peck extends SpecialMove
{
    public Peck()
    {
        super(Type.FLYING, 35, 1);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.7).stat(Stat.SPECIAL_ATTACK, 1).turns(-1);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        return "клюёт своего оппонента";
    }
}
