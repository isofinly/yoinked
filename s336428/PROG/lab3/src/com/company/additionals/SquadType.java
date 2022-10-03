package com.company.additionals;

public enum SquadType {
    RESQUERS("Спасательный отряд"),
    SCOUTING("Разведывательный отряд"),
    DEFENCE("Оборнительный отряд");
    private final String squadDecription;

    private SquadType(String desc){
        this.squadDecription = desc;
    }
    public String toString(){
        return this.squadDecription;
    }
}
