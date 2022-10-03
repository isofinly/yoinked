package ru.ifmo.se.pokemon.moves;

import ru.ifmo.se.pokemon.*;

public class Roost extends StatusMove {

    public Roost()
    {
        super(Type.FLYING, 0, 0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        int restoration = (int) Math.ceil(pokemon.getStat(Stat.HP) / 2);
        pokemon.setMod(Stat.HP, -restoration);
    }

    @Override
    protected String describe() {
        return "приземляется, чтобы использовать Roost";
    }
}
