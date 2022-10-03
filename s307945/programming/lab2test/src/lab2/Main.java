package lab2;
import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle battlefield = new Battle();
        Shelmet p1 = new Shelmet("Витя", 1);
        Poliwrath p2 = new Poliwrath("Жора", 1);
        Accelgor p3 = new Accelgor("Сергей", 1);

        Poliwhirl p4 = new Poliwhirl("Артём", 1);
        Chatot p5 = new Chatot("Валера", 1);
        Poliwag p6 = new Poliwag("Пичаку", 1);

        battlefield.addAlly(p1);
        battlefield.addAlly(p2);
        battlefield.addAlly(p3);

        battlefield.addFoe(p4);
        battlefield.addFoe(p5);
        battlefield.addFoe(p6);

        battlefield.go();
    }

    public static boolean chanceCheck(double chance) {
        return chance > (int) (Math.random()*100);
    }
}
