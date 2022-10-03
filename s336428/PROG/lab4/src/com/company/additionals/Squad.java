package com.company.additionals;

import com.company.creatures.Shorty;

public class Squad {
    private SquadType type;
    private String name;
    private final int maxCount;
    private static int currCount = 0;
    private String currentTask;
    private Shorty[] squadList;

    public Squad(String name, SquadType type){
        this.name = name;
        this.maxCount = 20;
        this.type = type;
        squadList = new Shorty[maxCount];
    }
    public Squad(String name, SquadType type, int maxcount){
        this.name = name;
        this.maxCount = maxcount;
        this.type = type;
        squadList = new Shorty[maxCount];
    }
    public String getStrSquadList(){
        String s = "Список членов отряда \"" + this.name + "\": ";
        for (int i = 0; i < maxCount; i++){
            if (squadList[i] != null) s += squadList[i].getName() + " ";
            else s += "";
        } if (s == "Список членов отряда \"" + this.name + "\": ") s += "Список пуст";
        return s;
    }
    public Shorty[] getSquadList(){
        return this.squadList;
    }
    public void AddToSquad(Shorty cr){
        if (squadList[0] == null) squadList[0] = cr;
        else if (currCount == this.maxCount) System.out.println("Отряд слишком велик!");
        else{
            int i = 0;
            while (squadList[i] != null){
                i += 1;
            }
            squadList[i] = cr;
        }
        currCount += 1;
    }
    public void RemoveFromSquad(Shorty cr){
        for (int i = 0; i < maxCount; i++){
            if (cr.equals(squadList[i])) squadList[i] = null;
        }
        currCount -= 1;
    }
    public String getSquadType(){
        return this.type.toString();
    }
    public void takeTask(String task, Shorty shorty){
        this.currentTask = task;
        System.out.println("Отряд " + this.name + " получил задание от " + shorty.getName()
                + ": " + task);
    }
    public int getCurrCount(){
        return currCount;
    }
    public String getName(){
        return name;
    }
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Squad o1 = (Squad) o;
        return this.type == o1.type && this.name == o1.name && this.maxCount == o1.maxCount && this.currentTask == o1.currentTask;
    }
}
