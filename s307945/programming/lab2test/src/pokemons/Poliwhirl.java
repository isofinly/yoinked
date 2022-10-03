package pokemons;
import moves.poliwag.Blizzard;
import moves.poliwag.Hypnosis;
import moves.poliwag.Wakeupslap;
import ru.ifmo.se.pokemon.Type;

public class Poliwhirl extends Poliwag {
    public Poliwhirl(String name, int level) {
        super(name, level);
        super.setType(Type.WATER);
        super.setStats(65, 65, 65, 50, 50, 90);
        Hypnosis hypnosis = new Hypnosis(0, 60);
        Blizzard blizzard = new Blizzard(110, 70);
        Wakeupslap wakeupslap = new Wakeupslap(70, 100);
        super.setMove(hypnosis, blizzard, wakeupslap);
    }
}
