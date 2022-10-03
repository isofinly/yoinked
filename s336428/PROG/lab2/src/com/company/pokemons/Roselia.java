package com.company.pokemons;

import com.company.moves.SleepPowder;
import ru.ifmo.se.pokemon.Type;

public class Roselia extends Budew{
    public Roselia(String name, int level){
        super(name,level);
        setStats(50,60,45,100,80,65);
        setType(Type.GRASS, Type.POISON);
        addMove(new SleepPowder());
    }
}
