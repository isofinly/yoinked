package ru.ifmo.se.pokemon;

import ru.ifmo.se.pokemon.moves.*;

public class Zapdos extends Pokemon
{
    public Zapdos(String name, int level)
    {
        super(name, level);
        setStats(90, 90, 85, 195, 190, 100);
        setType(Type.ELECTRIC, Type.FLYING);
        setMove(new AerialAce(), new ChargeBeam(), new Roost(), new Peck());
    }
}
