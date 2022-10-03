package moves.shelmet;
import ru.ifmo.se.pokemon.*;

public class Acidspray extends SpecialMove {
    public Acidspray(double power, double accuracy) {
        super(Type.POISON, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        Effect effect = new Effect().stat(Stat.SPECIAL_DEFENSE, -2);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "использует Acid Spray";
    }
}
