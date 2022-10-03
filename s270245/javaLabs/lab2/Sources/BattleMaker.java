import ru.ifmo.se.pokemon.*;

public class BattleMaker {

    public static void main(String[] args)
    {
        Battle battle = new Battle();

        battle.addAlly(new Zapdos("Кеша", 15));
        battle.addAlly(new Steenee("Письмак", 75));
        battle.addAlly(new Tsareena("Цапля", 60));

        battle.addFoe (new Shuppet("Бу", 50));
        battle.addFoe (new Banette("Байонетта", 65));
        battle.addFoe (new Bounsweet("Редька", 80));

        battle.go();
    }
}
