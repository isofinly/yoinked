package com.company.additionals;

public enum SpaceSpeed {
    NONE("NONE"),
    LOW("LOW"),
    MEDIUM("MEDIUM"),
    PRETTYFAST("PRETTYFAST"),
    VERYFAST("VERYFAST");
    private final String speedDescription;

    private SpaceSpeed(String desc){
        speedDescription = desc;
    }
    public String toString(){
        return speedDescription;
    }
}
