package attack;
import ru.ifmo.se.pokemon.*;

public class ConfuseRay extends StatusMove
{
    public ConfuseRay()
    {
        super(Type.GHOST, 0D, 100D); //type, power, accuracy
    }

   @Override protected void applyOppEffects(Pokemon p)
    {
        Effect.confuse(p);
        Effect increaseHp = new Effect();
        increaseHp.stat(Stat.HP, 50);
        p.addEffect(increaseHp);
    }
}
