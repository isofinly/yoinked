package moves.shelmet;
import lab2.Main;
import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove {
    public EnergyBall(double power, double accuracy) {
        super(Type.GRASS, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if(Main.chanceCheck(10)) {
            super.applyOppEffects(pokemon);
            Effect effect = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
            pokemon.addEffect(effect);
        }
    }

    @Override
    protected String describe() {
        return "использует Energy Ball";
    }
}
