import ru.ifmo.se.pokemon.*;
import attack.*;
public class Marshadow extends Pokemon {
    public Marshadow ( String name, int level )
    {
        super(name, level);
        setStats(90D, 125D, 80D, 90D, 90D, 125D); //hp,atack,defence,special //attack, special defence, speed
        setType(Type.FIGHTING, Type.GHOST);
        setMove(new Confide(), new ShadowSneak(), new Swagger(), new WillOWisp());
    }


}
