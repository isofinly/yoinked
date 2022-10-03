package attack;
import ru.ifmo.se.pokemon.*;

public class RazorLeaf extends PhysicalMove
{
    public RazorLeaf()
    {
        super(Type.GRASS, 55D, 95D); //type, power, accuracy
    }
        @Override protected void applySelfEffects(Pokemon p)
    {
        Effect increaseAttack = new Effect();
        increaseAttack.stat(Stat.ATTACK, 100);
        p.addEffect(increaseAttack);
    }

}
