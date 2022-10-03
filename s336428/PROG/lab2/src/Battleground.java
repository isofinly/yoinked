import com.company.pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Battleground{
    public static void main(String[] args0){
        Battle b = new Battle();
        b.addAlly(new Ledyba("bug1", 1));
        b.addAlly(new Ledian("bug2", 1));
        b.addAlly(new Mesprit("bug3", 1));
        b.addFoe(new Budew("grassdemon1", 1));
        b.addFoe(new Roselia("grassdemon2", 1));
        b.addFoe(new Roserade("grassdemon3", 1));
        b.go();
    }
}