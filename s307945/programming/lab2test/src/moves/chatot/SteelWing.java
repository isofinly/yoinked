package moves.chatot;
import ru.ifmo.se.pokemon.*;

public class SteelWing extends PhysicalMove {
    public SteelWing(double power, double accuracy) {
        super(Type.STEEL, power, accuracy);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        Effect effect = new Effect().stat(Stat.DEFENSE, 1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "использует Steel Wing";
    }
}
