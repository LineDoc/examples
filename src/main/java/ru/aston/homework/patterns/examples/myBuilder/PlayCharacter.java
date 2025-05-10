package ru.aston.homework.patterns.examples.myBuilder;

public class PlayCharacter {
    private final Race race;
    private final PlayClass playClass;
    private int level;
    private int health;
    private int mana;
    private int strength;
    private int dexterity;
    private int stamina;

    public PlayCharacter(Race race, PlayClass playClass, int level, int health, int mana, int strength, int dexterity, int stamina) {
        this.race = race;
        this.playClass = playClass;
        this.level = level;
        this.health = health;
        this.mana = mana;
        this.strength = strength;
        this.dexterity = dexterity;
        this.stamina = stamina;
    }

    public Race getRace() {
        return race;
    }

    public PlayClass getPlayClass() {
        return playClass;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getStamina() {
        return stamina;
    }

    @Override
    public String toString() {
        return "PlayCharacter {" +
                "race:" + race +
                ", playClass: " + playClass +
                ", level: " + level +
                ", health: " + health +
                ", mana: " + mana +
                ", strength: " + strength +
                ", dexterity: " + dexterity +
                ", stamina: " + stamina +
                '}';
    }
}
