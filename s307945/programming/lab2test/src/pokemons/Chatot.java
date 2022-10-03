package pokemons;
import moves.chatot.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
// Pokemon Link: https://pokemondb.net/pokedex/chatot
public class Chatot extends Pokemon {
    public Chatot(String name, int level) {
        super(name, level);
        super.setType(Type.NORMAL, Type.FLYING);
        super.setStats(76, 65, 45, 92, 42, 91);
        SteelWing steelWing = new SteelWing(70, 90);
        Swagger swagger = new Swagger(0, 85);
        Growl growl = new Growl(0, 100);
        Nastyplot nastyplot = new Nastyplot(0, 0);
        super.setMove(steelWing, swagger, growl, nastyplot);
        /* MOVES:
            Nasty Plot     https://pokemondb.net/move/nasty-plot
            Growl          https://pokemondb.net/move/growl
            Steel Wing     https://pokemondb.net/move/steel-wing +
            Swagger        https://pokemondb.net/move/swagger
         */

    }
}
