package com.company.pokemons;

import com.company.moves.GyroBall;
import com.company.pokemons.Ledyba;
import ru.ifmo.se.pokemon.Type;

public class Ledian extends Ledyba{
    public Ledian(String name, int level){
        super(name, level);
        setStats(55,35,50,55,110,85);
        setType(Type.BUG,Type.FLYING);
        addMove(new GyroBall());
    }
}
