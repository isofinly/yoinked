package moves.poliwag;
import lab2.Main;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Waterfall extends PhysicalMove {
    public Waterfall(double power, double accuracy) {
        super(Type.WATER, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if(Main.chanceCheck(20)) {
            Effect.flinch(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "использует Waterfall";
    }
}
