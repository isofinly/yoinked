import ru.ifmo.se.pokemon.*;
import attack.*;

public class Nuzleaf extends Seedot
{
    public Nuzleaf(String name, int level)
    {
        super(name, level);
        setStats(70D, 70D, 40D, 60D, 40D, 60D); //hp,attack,defence,special attack, //special defence, speed
        setType(Type.GRASS, Type.DARK);
        setMove(new Confide(), new EnergyBall(), new Extrasensory());
    }
}
