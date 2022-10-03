package attack;
import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove
{
    public Facade()
    {
        super(Type.NORMAL, 70D, 100D); //type, power, accuracy

    }   
        @Override protected void applySelfEffects(Pokemon p)     
       { 
        Effect increaseAttackEffect = new Effect();
        increaseAttackEffect.stat(Stat.ATTACK, 140);
        p.addEffect(increaseAttackEffect);
        }   
    
    
}
