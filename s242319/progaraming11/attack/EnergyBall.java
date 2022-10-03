package attack;
import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove
{
    public EnergyBall()
    {
        super(Type.GRASS, 90D, 100D); //type, power, accuracy
    }
    @Override protected void applyOppEffects(Pokemon p)
    {
        Effect decreaseSpecialDefenseEffect = new Effect();
        decreaseSpecialDefenseEffect.stat(Stat.SPECIAL_DEFENSE, -1);
        p.addEffect(decreaseSpecialDefenseEffect);

    }
}
