package ru.ifmo.se.pokemon.moves;

import ru.ifmo.se.pokemon.*;

public class DazzlingGleam extends SpecialMove
{
    public DazzlingGleam()
    {
        super(Type.FAIRY, 80, 1);
    }

    @Override
    protected String describe() {
        return "использует Dazzling Gleam";
    }
}
