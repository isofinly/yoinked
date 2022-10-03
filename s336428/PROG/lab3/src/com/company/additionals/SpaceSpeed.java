package com.company.additionals;

public enum SpaceSpeed {
    NONE("Корабль не движется"),
    LOW("Скорость корабля низкая"),
    MEDIUM("Скорость корабля средняя"),
    PRETTYFAST("Скорость корабля довольно высокая"),
    VERYFAST("Почти скорость света...");
    private final String speedDescription;

    private SpaceSpeed(String desc){
        speedDescription = desc;
    }
    public String toString(){
        return speedDescription;
    }
}
