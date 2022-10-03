package attack;
import ru.ifmo.se.pokemon.*;

public class Extrasensory extends SpecialMove
{
    public Extrasensory()
    {
        super(Type.PSYCHIC, 80D, 100D); //type, power, accuracy
    }
    @Override protected void applyOppEffects(Pokemon p)
    {
        Effect increaseflinch = new Effect().chance(10);
        Effect.flinch(p);
        p.addEffect(increaseflinch);
    }
}
