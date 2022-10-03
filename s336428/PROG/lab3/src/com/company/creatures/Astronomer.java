package com.company.creatures;

import com.company.additionals.Reserching;
import com.company.additionals.Spacesuit;

public class Astronomer extends Shorty implements Reserching {
    public Astronomer(String name){
        super(name);
    }
    public Astronomer(String name, int hp){
        super(name, hp);
    }
    public Spacesuit reserchSuit(int strenght) {
        return (new Spacesuit("Скафандр \"Вторая кожа\"", "Новый космический скафандр с прочностью: "
                + strenght + " единиц", strenght));
    }
    public Spacesuit reserchSuit() {
        return (new Spacesuit("Скафандр \"Вторая кожа\"","Новый космический скафандр с прочностью 55 единиц"));
    }
}
