package com.company.pokemons;

import com.company.moves.CrossChop;
import ru.ifmo.se.pokemon.Type;

public class Roserade extends Roselia{
    public Roserade(String name, int level){
        super(name,level);
        setStats(60,70,65,125,105,90);
        setType(Type.GRASS, Type.POISON);
        addMove(new CrossChop());
    }
}
