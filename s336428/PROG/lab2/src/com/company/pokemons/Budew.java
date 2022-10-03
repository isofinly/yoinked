package com.company.pokemons;

import com.company.moves.Fly;
import com.company.moves.SludgeBomb;
import ru.ifmo.se.pokemon.*;

public class Budew extends Pokemon {
    public Budew(String name, int level){
        super(name,level);
        setStats(40,30,35,50,70,55);
        setType(Type.GRASS, Type.POISON);
        addMove(new Fly());
        addMove(new SludgeBomb());
    }
}
