package moves.shelmet;
import ru.ifmo.se.pokemon.*;

public class Strugglebug extends SpecialMove {
    public Strugglebug(double power, double accuracy) {
        super(Type.BUG, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        Effect effect = new Effect().stat(Stat.SPECIAL_ATTACK, -1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "использует Struggle Bug";
    }
}
