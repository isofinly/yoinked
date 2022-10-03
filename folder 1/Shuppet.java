package ru.ifmo.se.pokemon;

import ru.ifmo.se.pokemon.moves.*;

public class Shuppet extends Pokemon
{
    public Shuppet(String name, int level)
    {
        super(name, level);
        setStats(44, 75, 35, 63, 33, 45);
        setType(Type.GHOST);
        setMove(new ThunderWave(), new Facade(), new CalmMind());
    }
}
