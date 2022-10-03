package moves.chatot;
import ru.ifmo.se.pokemon.*;

public class Nastyplot extends StatusMove {
    public Nastyplot(double power, double accuracy) {
        super(Type.DARK, power, accuracy);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        Effect effect = new Effect().stat(Stat.SPECIAL_ATTACK, 2);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "использует Nasty Plot";
    }
}
