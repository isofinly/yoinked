package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class Fly extends PhysicalMove {
    public Fly(){
        super(Type.FLYING, 90, 95);
    }

    protected String describe() {
        return "hits an opponent in flight";
    }
}
