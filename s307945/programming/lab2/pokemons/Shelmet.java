package pokemons;
import moves.shelmet.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
// Pokemon Link: https://pokemondb.net/pokedex/shelmet
public class Shelmet extends Pokemon {
    public Shelmet(String name, int level) {
        super(name, level);
        super.setType(Type.BUG);
        super.setStats(50, 40, 85, 40, 65, 25);
        EnergyBall energyBall = new EnergyBall(90, 100);
        Strugglebug strugglebug = new Strugglebug(50, 100);
        Recover recover = new Recover(0, 0);
        super.setMove(energyBall, strugglebug, recover);
        /* MOVES:
            Struggle Bug   https://pokemondb.net/move/struggle-bug
            Energy Ball    https://pokemondb.net/move/energy-ball
            Recover        https://pokemondb.net/move/recover
         */
    }
}
