package attack;
import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove
{
    public Confide()
    {
        super(Type.NORMAL, 0D, 0D); //type, power, accuracy
    }

    @Override protected void applyOppEffects(Pokemon p)
    {
        Effect decreaseSpecialAttackEffect = new Effect();
        decreaseSpecialAttackEffect.stat(Stat.SPECIAL_ATTACK, -1);
        p.addEffect(decreaseSpecialAttackEffect);
    }
}