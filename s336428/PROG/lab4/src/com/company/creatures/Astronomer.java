package com.company.creatures;

import com.company.additionals.Moon;
import com.company.additionals.Reserching;
import com.company.additionals.Spaceship;
import com.company.additionals.Spacesuit;

public class Astronomer extends Shorty implements Reserching {
    public Astronomer(String name){
        super(name);
    }
    public Astronomer(String name, int hp){
        super(name, hp);
    }
    public boolean InspectSurface(Object o, Moon moon){
        if (moon.SurfaceContain(o)&& o instanceof Spaceship){
            Spaceship o1 = (Spaceship) o;
            System.out.println(this.name + " обнаружил на поверхности Луны: " + o1.toString());
            return true;
        }else if (moon.SurfaceContain(o)){
            System.out.println(this.name + " обнаружил на поверности луны: " + o.toString());
            return true;
        }
        System.out.println(this.name + " ничего не обнаружил");
        return false;
    }
    public Spacesuit reserchSuit(int strenght) {
        return (new Spacesuit("Скафандр \"Вторая кожа\"", "Новый космический скафандр с прочностью: "
                + strenght + " единиц", strenght));
    }
    public Spacesuit reserchSuit() {
        return (new Spacesuit("Скафандр \"Вторая кожа\"","Новый космический скафандр с прочностью 55 единиц"));
    }
}
