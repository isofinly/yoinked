package pokemons;
import moves.poliwag.Blizzard;
import moves.poliwag.Hypnosis;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwag extends Pokemon {
    public Poliwag(String name, int level) {
        super(name, level);
        super.setType(Type.WATER);
        super.setStats(40, 50, 40, 40, 40, 90);
        Hypnosis hypnosis = new Hypnosis(0, 60);
        Blizzard blizzard = new Blizzard(110, 70);
        super.setMove(hypnosis, blizzard);
    }
}
