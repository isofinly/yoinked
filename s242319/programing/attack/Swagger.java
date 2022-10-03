package attack;
import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove
{
    public Swagger()
    {
        super(Type.NORMAL, 0D, 85D); //type, power, accuracy
    }
    @Override protected void applyOppEffects(Pokemon p)
    {
        Effect.confuse(p);
                Effect increaseAttackEffect = new Effect();
        increaseAttackEffect.stat(Stat.ATTACK, 2);
        p.addEffect(increaseAttackEffect);
    }
}
