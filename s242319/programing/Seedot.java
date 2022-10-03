import ru.ifmo.se.pokemon.*;
import attack.*;

public class Seedot extends Pokemon
{
    public Seedot(String name, int level)
    {
        super(name, level);
        setStats(40D, 40D, 50D, 30D, 30D, 30D); //hp,attack,defence,special attack, //special defence, speed
        setType(Type.GRASS);
        setMove(new Confide(), new EnergyBall());
    }
}
