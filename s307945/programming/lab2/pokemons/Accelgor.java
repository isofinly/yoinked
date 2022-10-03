package pokemons;
import moves.shelmet.*;
import ru.ifmo.se.pokemon.Type;
// Pokemon Link: https://pokemondb.net/pokedex/accelgor
public class Accelgor extends Shelmet {
    public Accelgor(String name, int level) {
        super(name, level);
        super.setType(Type.BUG);
        super.setStats(80, 70, 40, 100, 60, 145);
        EnergyBall energyBall = new EnergyBall(90, 100);
        Strugglebug strugglebug = new Strugglebug(50, 100);
        Recover recover = new Recover(0, 0);
        Acidspray acidspray = new Acidspray(40, 100);
        super.setMove(energyBall, strugglebug, recover, acidspray);
        /* MOVES:
            Struggle Bug   https://pokemondb.net/move/struggle-bug
            Energy Ball    https://pokemondb.net/move/energy-ball
            Recover        https://pokemondb.net/move/recover
            Acid Spray     https://pokemondb.net/move/acid-spray
         */
    }
}
