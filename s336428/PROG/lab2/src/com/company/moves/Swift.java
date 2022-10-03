package com.company.moves;

import ru.ifmo.se.pokemon.*;

public class Swift extends SpecialMove {
    public Swift(){
        super(Type.NORMAL, 60,1);
    }

    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    protected String describe() {
        return "hits with Swift";
    }
}
