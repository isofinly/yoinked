package ru.ifmo.se.pokemon.moves;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {

    public AerialAce()
    {
        super(Type.FLYING, 60, Double.POSITIVE_INFINITY);
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }

    @Override
    protected String describe() {
        return "использует Areal Ace";
    }
}
