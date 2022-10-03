package com.company.additionals;

import java.util.ArrayList;

public class Moon {
    private ArrayList<Object> orbit;
    private ArrayList<Object> surface;

    public Moon(){
        orbit = new ArrayList<>();
        surface = new ArrayList<>();
    }

    public boolean SurfaceContain(Object o){
        return surface.contains(o);
    }
    public void LandOnYourself(Flying flying){
        this.AddToSurface(flying);
    }
    public void TakeOffFromYourself(Flying flying){
        this.RemoveFromSurface(flying);
    }
    public void FlyIntoOrbit(Flying flying){
        this.AddToOrbit(flying);
    }
    public void FlyOutOfOrbit(Flying flying, String speed){
        if (speed.toUpperCase().equals("LOW")) System.out.println("Недостаточно скорости для выхода с орбиты");
        else this.RemoveFromOrbit(flying);
    }
    private void AddToSurface(Flying flying){
        if (surface.contains(null)){
            for (int i = 0; i < surface.size(); i++){
                if (surface.get(i) == null){
                    surface.set(i, flying);
                    break;
                }
            }
        } else surface.add(flying);
    }
    private void RemoveFromSurface(Flying flying){
        if (!surface.contains(flying)) System.out.println("Такого объекта на поверхности и не было");
        else surface.set(surface.indexOf(flying), null);
    }
    private void AddToOrbit(Flying flying){
        if (orbit.contains(null)){
            for (int i = 0; i < orbit.size(); i++){
                if (orbit.get(i) == null){
                    orbit.set(i, flying);
                    break;
                }
            }
        } else orbit.add(flying);
    }

    private void RemoveFromOrbit(Flying flying){
        if (!orbit.contains(flying)) System.out.println("Такого объекта на орбите и не было");
        else orbit.set(orbit.indexOf(flying), null);
    }
}
