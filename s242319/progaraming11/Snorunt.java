import ru.ifmo.se.pokemon.*;
import attack.*;
public class Snorunt extends Pokemon {
    public Snorunt (String name, int level)
    {
        super(name, level);
        setStats(50D, 50D, 50D, 50D, 50D, 50D); //hp,attack, deffence special attack, //special defence, speed
        setType(Type.ICE);
        setMove(new Confide(), new Facade(), new Rest());
    }

}
