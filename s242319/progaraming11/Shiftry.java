import ru.ifmo.se.pokemon.*;
import attack.*;

public class Shiftry extends  Nuzleaf
{
    public Shiftry(String name, int level)
    {
        super(name, level);
        setStats(90D, 100D, 60D, 90D, 60D, 80D); //hp,attack,defence,special attack, //special defence, speed
        setType(Type.GRASS, Type.DARK);
        setMove(new Confide(), new EnergyBall(), new Extrasensory(), new RazorLeaf());
    }
}
