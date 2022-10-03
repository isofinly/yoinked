package moves.chatot;
import lab2.Main;
import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(double power, double accuracy) {
        super(Type.NORMAL, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        Effect.confuse(pokemon);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if(Main.chanceCheck(10)) {
            super.applySelfEffects(pokemon);
            Effect effect = new Effect().stat(Stat.ATTACK, 2);
            pokemon.addEffect(effect);
        }
    }

    @Override
    protected String describe() {
        return "использует Swagger";
    }
}
