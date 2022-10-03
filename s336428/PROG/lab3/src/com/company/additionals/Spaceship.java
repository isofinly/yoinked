package com.company.additionals;

import com.company.creatures.Shorty;

import java.util.Objects;

public class Spaceship implements Flying{
    private String name;
    private final int maxCrew;
    private final String constructorsName;
    private static int countCrew = 0;
    private static int countIsInside = 0;
    private boolean hasLanded;
    private SpaceSpeed speed;
    private Shorty[] crewList;
    private Shorty[] whoIsInside;
    //==========
    public Spaceship(String name){
        this.name = name;
        this.maxCrew = 10;
        this.crewList = new Shorty[maxCrew];
        this.whoIsInside = new Shorty[maxCrew];
        this.constructorsName = "безконструкторный корабль";
    }
    public Spaceship(String name, String constName, int maxcrew){
        this.name = name;
        this.maxCrew = maxcrew;
        this.crewList = new Shorty[maxCrew];
        this.whoIsInside = new Shorty[maxCrew];
        this.constructorsName = constName;
    }
    public String getCrewList(){
        String s = "Список членов экипажа: ";
        for (int i = 0; i < maxCrew; i++){
            if (crewList[i] != null) s += crewList[i].getName() + " ";
            else s += "";
        } if (s == "Список членов экипажа: ") s = "Список пуст";
        return s;
    }
    public void AddToCrew(Shorty cr){
        if (crewList[0] == null){
            crewList[0] = cr;
            whoIsInside[0] = cr;
        }
        else if (countCrew == this.maxCrew) System.out.println("Корабль переполнен!");
        else{
            int i = 0;
            while (crewList[i] != null){
                i += 1;
            }
            crewList[i] = cr;
            whoIsInside[i] = cr;
        }
        countCrew += 1;
        countIsInside += 1;
    }
    public void RemoveFromCrew(Shorty cr){
        for (int i = 0; i < maxCrew; i++){
            if (cr.equals(crewList[i])){
                crewList[i] = null;
                whoIsInside[i] = null;
            }
        }
        countCrew -= 1;
        countIsInside -= 1;
    }
    public void toLand(){
        this.hasLanded = true;
        this.speed = SpaceSpeed.NONE;
        System.out.println("Корабль приземлился");
    }
    public void toTakeOff(){
        this.hasLanded = false;
        this.speed = SpaceSpeed.LOW;
        System.out.println("Космичейский корабль взлетает!");
    }
    public String getName(){
        return this.name;
    }
    public String getConstructorsName(){
        return this.constructorsName;
    }
    public String getCurrentSpeed() {
        return this.speed.toString();
    }
    public void increaseSpeed(){
        if (this.speed == SpaceSpeed.LOW) this.speed = SpaceSpeed.MEDIUM;
        else if (this.speed == SpaceSpeed.MEDIUM) this.speed = SpaceSpeed.PRETTYFAST;
        else if (this.speed == SpaceSpeed.PRETTYFAST) this.speed = SpaceSpeed.VERYFAST;
        else System.out.println("Скорость почти световая, дальше увеличивать не получится!");
    }
    public void toStop(){
        this.speed = SpaceSpeed.NONE;
        System.out.println("Корабль остановился");
    }
    public void reduceSpeed(){
        if (this.speed == SpaceSpeed.VERYFAST) this.speed = SpaceSpeed.PRETTYFAST;
        else if (this.speed == SpaceSpeed.PRETTYFAST) this.speed = SpaceSpeed.MEDIUM;
        else if (this.speed == SpaceSpeed.MEDIUM) this.speed = SpaceSpeed.LOW;
        else this.toStop();
    }
    public boolean seekOutInside(Shorty shorty){
        boolean f = false;
        for (int i = 0; i < maxCrew; i++){
            if (shorty.equals(whoIsInside[i])) f = true;
        }
        if (f) System.out.println(shorty.getName() + " в ракете!");
        else System.out.println(shorty.getName() + " в ракете не найден");
        return f;
    }
    public void getInside(Shorty shorty){
        if (whoIsInside[0] == null){
            whoIsInside[0] = shorty;
            System.out.println(shorty.getName() + " проник на корабль!");
        }
        else if (countIsInside == maxCrew) System.out.println("Внутрь проникнуть не получится, места нет");
        else {
            int i = 0;
            while (whoIsInside[i] != null){
                i += 1;
            }
            whoIsInside[i] = shorty;
            System.out.println(shorty.getName() + " проник на корабль!");
        }
        countIsInside += 1;
    }
    //=========

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Spaceship o1 = (Spaceship) o;
        return this.name == o1.name && this.maxCrew == o1.maxCrew
                && this.constructorsName == o1.constructorsName;
    }

    public String toString(){
        return ("Космический корабль " + this.name + ", конструкторы: "
                + this.constructorsName + ", максимально число экипажа: " + this.maxCrew);
    }

    public int HashCode(){
        int result = 31;
        result = result + Objects.hash(name, constructorsName);
        result = result*31 + maxCrew;
        return result;
    }
}
