package moves.shelmet;
import ru.ifmo.se.pokemon.*;

public class Recover extends StatusMove {
    public Recover(double power, double accuracy) {
        super(Type.NORMAL, power, accuracy);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        int hpRestored = (int) pokemon.getHP() + (int) pokemon.getHP()/2;
        Effect effect = new Effect().stat(Stat.HP, hpRestored);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "использует Recover";
    }
}
