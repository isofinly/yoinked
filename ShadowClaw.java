package ru.ifmo.se.pokemon;
//Необходимо использовать не публичный статичный метод Messages.get,
//Поэтому используем стандартный пакет вместо .moves

public class ShadowClaw extends PhysicalMove {

    public ShadowClaw()
    {
        super(Type.GHOST, 70, 1);
    }

    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1)
    {
        if (Math.random() * 8 < 1) {
            System.out.println(Messages.get("critical"));
            return 2.0D;
        }
        else
            return 1.0D;
    }

    @Override
    protected String describe() {
        return "использует Shadow Claw";
    }
}
