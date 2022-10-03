package attack;
import ru.ifmo.se.pokemon.*;

public class WillOWisp extends StatusMove
{
    public WillOWisp()
    {
        super(Type.FIRE, 0D, 85D); //type, power, accuracy
    }
    
    @Override protected void applyOppEffects(Pokemon p)
    {
        Effect.burn(p);
    }
}
