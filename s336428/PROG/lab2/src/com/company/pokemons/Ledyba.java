package com.company.pokemons;

import com.company.moves.*;
import ru.ifmo.se.pokemon.*;

public class Ledyba extends Pokemon{
    public Ledyba(String name, int level){
        super(name,level);
        setStats(40,20,30,40,80,55);
        setType(Type.BUG, Type.FLYING);
        addMove(new Swift());
        addMove(new CometPunch());
        addMove(new SilverWind());
    }
}
