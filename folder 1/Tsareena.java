package ru.ifmo.se.pokemon;

import ru.ifmo.se.pokemon.moves.DazzlingGleam;

public class Tsareena extends Steenee {

    public Tsareena(String name, int level)
    {
        super(name, level);
        setStats(72, 120, 98, 50, 98, 72);
        addMove(new DazzlingGleam());
    }
}
