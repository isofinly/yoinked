package moves.poliwag;
import ru.ifmo.se.pokemon.*;

public class Wakeupslap extends PhysicalMove {
    public Wakeupslap(double power, double accuracy) {
        super(Type.FIGHTING, power, accuracy);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        if(pokemon.getCondition() == Status.SLEEP) {
            pokemon.setCondition(new Effect().condition(Status.NORMAL));
            super.applyOppDamage(pokemon, damage*2);
        }
    }

    @Override
    protected String describe() {
        return "использует Wake-Up Slap";
    }
}
