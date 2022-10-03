import ru.ifmo.se.pokemon.*;
import java.util.*;

public class BattleGround
{
   public  static void main(String[] args)
    {
        Marshadow man = new Marshadow("Dendi", 87);

        Snorunt man1 = new Snorunt("XBOCT",48);

        Froslass man2 = new Froslass("Puppey",44);
    
        Seedot girl = new Seedot("Zou Yitian", 53);

        Nuzleaf girl1 = new Nuzleaf("Yao Yi", 49);
        
        Shiftry girl2 = new Shiftry("Tang Wenyi", 49);
        
        Battle testBattle = new Battle();

        testBattle.addAlly(man);
        testBattle.addAlly(man1);
        testBattle.addAlly(man2);

        testBattle.addFoe(girl);
        testBattle.addFoe(girl1);
        testBattle.addFoe(girl2);
        testBattle.go();
    }
}
