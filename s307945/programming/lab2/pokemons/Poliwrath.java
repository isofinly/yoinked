package pokemons;
import moves.poliwag.*;
import ru.ifmo.se.pokemon.Type;
// Pokemon Link: https://pokemondb.net/pokedex/poliwrath
public class Poliwrath extends Poliwhirl{
    public Poliwrath(String name, int level) {
        super(name, level);
        super.setType(Type.WATER, Type.FIGHTING);
        super.setStats(90, 95, 95, 70, 90, 70);
        Hypnosis hypnosis = new Hypnosis(0, 60);
        Blizzard blizzard = new Blizzard(110, 70);
        Wakeupslap wakeupslap = new Wakeupslap(70, 100);
        Waterfall waterfall = new Waterfall(80, 100);
        super.setMove(hypnosis, blizzard, wakeupslap, waterfall);
    }
}
