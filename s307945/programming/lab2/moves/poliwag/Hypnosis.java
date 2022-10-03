package moves.poliwag;
import ru.ifmo.se.pokemon.*;

public class Hypnosis extends StatusMove {
    public Hypnosis(double power, double accuracy) {
        super(Type.PSYCHIC, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        int random = (int) (Math.random()*3);
        Effect effect = new Effect().condition(Status.SLEEP).turns(random);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "использует Hypnosis";
    }
}
