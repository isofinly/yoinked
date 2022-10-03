package moves.chatot;
import ru.ifmo.se.pokemon.*;

public class Growl extends StatusMove {
    public Growl(double power, double accuracy) {
        super(Type.NORMAL, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        Effect effect = new Effect().stat(Stat.ATTACK, -1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "использует Growl";
    }
}
