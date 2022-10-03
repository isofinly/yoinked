import ru.ifmo.se.pokemon.*;
import attack.*;
public class Froslass extends  Snorunt {
    public Froslass(String name, int level) {
        super(name, level);
        setStats(50D, 50D, 50D, 50D, 50D, 50D); //hp,attack, deffence special attack, //special defence, speed
        setType(Type.ICE);
        setMove(new Confide(), new Facade(), new Rest(), new ConfuseRay());
    }
}
