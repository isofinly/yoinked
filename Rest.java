package attack;
import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove
{
    public Rest()
    {
        super(Type.PSYCHIC, 0D, 0D); //type, power, accuracy
    }

    @Override protected void applySelfEffects(Pokemon p)
    {   
        Effect.sleep(p);
        Effect increaseHp = new Effect().turns(2);
        increaseHp.stat(Stat.HP, 100);
        p.addEffect(increaseHp);
    }
}
