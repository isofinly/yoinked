package com.company.pokemons;

import com.company.moves.*;
import ru.ifmo.se.pokemon.*;

public class Mesprit extends Pokemon {
    public Mesprit(String name, int level){
        super(name,level);
        setStats(80,105,105,105,105,80);
        setType(Type.PSYCHIC);
        addMove(new Rest());
        addMove(new MistBall());
        addMove(new JumpKick());
        addMove(new Rollout());
    }
}
