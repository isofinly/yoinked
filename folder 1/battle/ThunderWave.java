package ru.ifmo.se.pokemon.moves;

        import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove {

    public ThunderWave()
    {
        super(Type.FLYING, 0, 0.9);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.paralyze(pokemon);
    }

    @Override
    protected String describe() {
        return "собирается использовать Thunder Wave";
    }
}
