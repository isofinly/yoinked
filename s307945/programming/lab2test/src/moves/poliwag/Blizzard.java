package moves.poliwag;
import lab2.Main;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Blizzard extends StatusMove {
    public Blizzard(double power, double accuracy) {
        super(Type.ICE, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if(Main.chanceCheck(10)) {
            Effect.freeze(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "использует Blizzard";
    }
}
