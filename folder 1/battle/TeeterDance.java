package ru.ifmo.se.pokemon.moves;

import ru.ifmo.se.pokemon.*;

public class TeeterDance extends StatusMove
{
    public TeeterDance()
    {
        super(Type.NORMAL, 0, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.confuse(pokemon);
    }

    @Override
    protected String describe() {
        return "вводит всех покемонов в конфуз своим Teeter Dance";
    }
}
