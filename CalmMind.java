package ru.ifmo.se.pokemon.moves;

import ru.ifmo.se.pokemon.*;

public class CalmMind extends StatusMove {

    public CalmMind() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_ATTACK, 1);
        pokemon.setMod(Stat.SPECIAL_DEFENSE, 1);
    }

    @Override
    protected String describe() {
        return "фокусируется и использует Calm Mind";
    }
}
