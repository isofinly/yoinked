package com.company.additionals;

import com.company.creatures.Shorty;
import com.company.exceptions.ExceedingTheMaxCapacity;
import com.company.exceptions.GetNonExistentItem;

import java.util.ArrayList;
import java.util.Objects;

public class Spaceship implements Flying{
    private String name;
    private final int maxCrew;
    private final String constructorsName;
    private static int countCrew = 0;
    private static int countIsInside = 0;
    private boolean hasLanded = true;
    private boolean onOrbit = false;
    private SpaceSpeed speed;
    private Shorty[] crewList;
    public FoodContainer foodContainer;
    public SpacesuitContainer spacesuitContainer;
    private Room[] rooms = new Room[4];
    //==========
    public Spaceship(String name){
        this.name = name;
        this.maxCrew = 10;
        this.crewList = new Shorty[maxCrew];
        this.constructorsName = "безконструкторный корабль";
        Room prihozhaya = new Room("Специальный отсек");
        Room r1 = new Room("Каюта 1");
        Room r2 = new Room("Каюта 2");
        Room r3 = new Room("Каюта капитана");
        rooms[0] = prihozhaya;rooms[1] = r1;rooms[2] = r2;rooms[3] = r3;
        this.foodContainer = new FoodContainer();
        this.spacesuitContainer = new SpacesuitContainer();
    }
    public Spaceship(String name, String constName, int maxcrew){
        this.name = name;
        this.maxCrew = maxcrew;
        this.crewList = new Shorty[maxCrew];
        this.constructorsName = constName;
        Room prihozhaya = new Room("Специальный отсек");
        Room r1 = new Room("Каюта 1");
        Room r2 = new Room("Каюта 2");
        Room r3 = new Room("Каюта капитана");
        rooms[0] = prihozhaya;rooms[1] = r1;rooms[2] = r2;rooms[3] = r3;
        this.foodContainer = new FoodContainer();
        this.spacesuitContainer = new SpacesuitContainer();
    }
    public static class Room{
        private String name;
        private ArrayList<Shorty> shorties = new ArrayList<>();
        public Room(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
        private void RemoveFromRoom(Shorty shorty){
            for (int i = 0; i < shorties.size(); i++){
                if (shorty.equals(shorties.get(i))) shorties.remove(i);
            }
        }
        private void AddInRoom(Shorty shorty){
            shorties.add(shorty);
        }
        public boolean SeekOutRoom(Shorty shorty){
            for (int i = 0; i < shorties.size(); i++){
                if (shorty.equals(shorties.get(i))){
                    System.out.println(shorty.getName() + " в комнате " + name);
                    return true;
                }
            }
            System.out.println(shorty.getName() + " в комнате " + name + " не найден");
            return false;
        }
        public void MoveToRoom(Room room, Shorty shorty){
            if (!shorties.contains(shorty)) System.out.println("Такого в этой комнате не было");
            else{
                this.RemoveFromRoom(shorty);
                room.AddInRoom(shorty);
                System.out.println(shorty.getName() + " перешел в " + room.getName());
            }
        }
    }
    public static class FoodContainer{
        private ArrayList<Food> foods = new ArrayList<>();
        public boolean isEmpty(){
            return foods.size() == 0;
        }
        public void add(Food food){
            foods.add(food);
        }
        public Food getSomeFood() throws GetNonExistentItem{
            if (!isEmpty()){
                Food f = foods.get(foods.size()-1);
                foods.remove(f);
                return f;
            } else{
                throw new GetNonExistentItem("Еда кончилась........");
            }
        }
    }
    public static class SpacesuitContainer{
        private ArrayList<Spacesuit> spacesuits = new ArrayList<>();
        private static int suitCount = 0;
        public boolean isEmpty(){
            return spacesuits.size() == 0;
        }
        public void add(Spacesuit spacesuit){
            spacesuits.add(spacesuit);
        }
        public Spacesuit getSomeSuit() throws GetNonExistentItem{
            if (!isEmpty()){
                Spacesuit s = spacesuits.get(spacesuits.size()-1);
                spacesuits.remove(s);
                suitCount += 1;
                return s;
            } else{
                throw new GetNonExistentItem("Скафандров больше нет.....");
            }
        }
        public int getSuitCount(){return suitCount;}
    }

    public String getCrewList(){
        String s = "Список членов экипажа: ";
        for (int i = 0; i < maxCrew; i++){
            if (crewList[i] != null) s += crewList[i].getName() + " ";
            else s += "";
        } if (s == "Список членов экипажа: ") s = "Список пуст";
        return s;
    }
    public void AddToCrew(Shorty cr) throws ExceedingTheMaxCapacity{
        if (crewList[0] == null){
            crewList[0] = cr;
            countCrew += 1;
        }
        else if (countCrew >= this.maxCrew){
            throw new ExceedingTheMaxCapacity("Экипаж уже набран!");
        }
        else{
            int i = 0;
            while (crewList[i] != null){
                i += 1;
            }
            crewList[i] = cr;
            countCrew += 1;
        }
    }
    public void RemoveFromCrew(Shorty cr){
        for (int i = 0; i < maxCrew; i++){
            if (cr.equals(crewList[i])){
                crewList[i] = null;
                countCrew -= 1;
            }
        }
    }
    public void toLand(Moon moon){
        class LandingGear{
            public void startLanding(){
                moon.LandOnYourself(Spaceship.this);
                speed = SpaceSpeed.NONE;
                hasLanded = true;
                System.out.println("Посадочный механизм начал свою работу");
            }
        }
        LandingGear gearOne = new LandingGear();
        gearOne.startLanding();
        System.out.println("Корабль " + Spaceship.this.name + " приземлился на Луну");
    }
    public void toTakeOff(){
        this.hasLanded = false;
        this.speed = SpaceSpeed.LOW;
        System.out.println("Космический корабль взлетает!");
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
    public void increaseSpeed() {
        if (this.speed == SpaceSpeed.LOW) this.speed = SpaceSpeed.MEDIUM;
        else if (this.speed == SpaceSpeed.MEDIUM) this.speed = SpaceSpeed.PRETTYFAST;
        else if (this.speed == SpaceSpeed.PRETTYFAST) this.speed = SpaceSpeed.VERYFAST;
        else System.out.println("Скорость почти световая, дальше увеличивать не получится!");
    }
    public void toStop(){
        this.speed = SpaceSpeed.NONE;
        System.out.println("Корабль остановился");
    }
    public void toMoonOrbit(Moon moon){
        moon.FlyIntoOrbit(this);
        onOrbit = true;
        System.out.println("Корабль попал на орбиту Луны");
    }
    public void MakeOrbitLoop(){
        if (onOrbit) System.out.println("Ракета совершает виток");
        else System.out.println("Ракета же не на орбите");
    }
    public void fromMoonOrbit(Moon moon){
        if (onOrbit) moon.FlyOutOfOrbit(this, this.getCurrentSpeed());
        else System.out.println("Ракета же не на орбите");
    }
    public void reduceSpeed(){
        if (this.speed == SpaceSpeed.VERYFAST) this.speed = SpaceSpeed.PRETTYFAST;
        else if (this.speed == SpaceSpeed.PRETTYFAST) this.speed = SpaceSpeed.MEDIUM;
        else if (this.speed == SpaceSpeed.MEDIUM) this.speed = SpaceSpeed.LOW;
        else this.toStop();
    }
    public boolean seekOutInside(Shorty shorty, Shorty shorty2){
        for (int i = 0; i < 3; i++){
            if (rooms[i].SeekOutRoom(shorty)) {
                return true;
            }
            rooms[i].MoveToRoom(rooms[i+1], shorty2);
        }
        if (rooms[3].SeekOutRoom(shorty)){
            rooms[3].MoveToRoom(rooms[0], shorty2);
            return true;
        }
        rooms[3].MoveToRoom(rooms[0], shorty2);
        System.out.println(shorty.getName() + " в корабле нет");
        return false;
    }
    private boolean seek(Shorty shorty){
        for (Room room : rooms){
            if (room.SeekOutRoom(shorty)) return true;
        }
        return false;
    }
    public void getInside(Squad squad) throws ExceedingTheMaxCapacity {
        int i = 0;
        if (maxCrew - countIsInside < squad.getCurrCount()){
            throw new ExceedingTheMaxCapacity("Ракета переполнена!");
        }
        else{
            for (Shorty shorty: squad.getSquadList()){
                if (shorty != null){
                    rooms[0].AddInRoom(shorty);
                    countIsInside += 1;
                }
            }
            System.out.println("Отряд " + squad.getName() + " проник на корабль");
        }
    }
    public void getInside(Shorty shorty) throws ExceedingTheMaxCapacity{
        if (countIsInside >= maxCrew){
            throw new ExceedingTheMaxCapacity("Ракета переполнена!");
        }
        else{
            rooms[0].AddInRoom(shorty);
            countIsInside += 1;
            System.out.println(shorty.getName() + " проник на корабль");
        }
    }
    public void getOutside(Shorty shorty){
        if (!this.seek(shorty)) System.out.println("Его тут и не было...");
        else {
            for (Room room: rooms){
                if (room.SeekOutRoom(shorty)){
                    room.RemoveFromRoom(shorty);
                    countIsInside -= 1;
                }
            }
            System.out.println(shorty.getName() + " покинул корабль");
        }
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
}
