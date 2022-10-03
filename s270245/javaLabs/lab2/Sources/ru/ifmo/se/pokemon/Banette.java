package ru.ifmo.se.pokemon;

public class Banette extends Shuppet {

    public Banette(String name, int level) {
        super(name, level);
        setStats(64, 115, 65, 83, 63, 65);
        addMove(new ShadowClaw());
    }
}
