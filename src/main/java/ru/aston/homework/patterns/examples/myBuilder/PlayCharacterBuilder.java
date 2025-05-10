package ru.aston.homework.patterns.examples.myBuilder;

public class PlayCharacterBuilder implements Builder {
    private Race race;
    private PlayClass playClass;
    private int level;
    private int health;
    private int mana;
    private int strength;
    private int dexterity;
    private int stamina;

    @Override
    public void setRace(Race race) {
        this.race = race;
    }

    @Override
    public void setPlayClass(PlayClass playClass) {
        this.playClass = playClass;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    @Override
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public PlayCharacter getPlayCharacter() {
        return new PlayCharacter(race, playClass, level, health, mana, strength, dexterity, stamina);
    }
}
