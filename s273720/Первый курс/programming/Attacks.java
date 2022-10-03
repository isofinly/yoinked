import ru.ifmo.se.pokemon.*;
 
class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC,0,100);
    }
   
    protected void applySelfEffects (Pokemon pokemon) {
        Effect e = new Effect().turns(2);
       
        pokemon.restore();
        e.sleep(pokemon) ;}
 
}
class DoubleTeam extends StatusMove{
    public DoubleTeam() {
        super(Type.NORMAL,0,100);
 
    }
    protected void applySelfEffects (Pokemon pokemon) {
        pokemon.setMod(Stat.EVASION, 1);
    }
}
class Facade extends PhysicalMove{
    protected Facade() {
        super(Type.NORMAL,70,100);
    }
    protected void applyOppDamage(Pokemon def,int damage) {
        Status PokCon = def.getCondition();
        if(PokCon.equals(Status.BURN) || PokCon.equals(Status.POISON) || PokCon.equals(Status.PARALYZE)) {
            def.setMod(Stat.HP, (int) Math.round(damage)*2);//round(+0.5 and get down a int)
        }
    }
}
class FeintAttack extends PhysicalMove{
    protected FeintAttack() {
        super(Type.DARK,60,100);
    }
    }
class Extrasensory extends SpecialMove{
    protected Extrasensory() {
        super(Type.PSYCHIC,80,100);
    }
    protected void applyOppEffects (Pokemon def) {
        if (Math.random()<0.1) {
            Effect.flinch(def);
        }
    }
}
class Swagger extends StatusMove{
    public Swagger () {
        super(Type.NORMAL,0,85);
    }
    protected void applyOppEffects(Pokemon def) {
        if (Math.random()<0.15) {
            def.setMod(Stat.ATTACK,2);
            Effect.confuse(def);
        }
    }
}
class RockTomb extends PhysicalMove{
    public RockTomb() {
        super(Type.ROCK,60,95);
    }
    protected void applyOppEffects(Pokemon def) {
        if(Math.random()<0.05) {
            def.setMod(Stat.SPEED,-1);
        }
    }
}
class ZenHeadbutt extends PhysicalMove {
    public ZenHeadbutt() {
        super(Type.PSYCHIC,80,90);
    }
    protected void applyOppEffects(Pokemon def) {
        if(Math.random()<0.2) {
            Effect.flinch(def);
        }
    }
}
class Confide extends StatusMove{
    public Confide () {
        super(Type.NORMAL,0,0);
    }
    protected void applyOppEffects(Pokemon def) {
        def.setMod(Stat.SPECIAL_ATTACK,-1);
    }
}
class SonicBoom extends SpecialMove{
    public SonicBoom() {
        super(Type.NORMAL,0,90);
    }
   
}
class TakeDown extends PhysicalMove{
    public TakeDown() {
        super(Type.NORMAL,90,85);
    }
    protected void applySelfDamage(Pokemon pokemon,double damage) {
        pokemon.setMod(Stat.HP,(int) Math.round(damage)/4 );;
    }
}
