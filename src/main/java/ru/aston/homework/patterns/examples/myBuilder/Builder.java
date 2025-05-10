package ru.aston.homework.patterns.examples.myBuilder;

public interface Builder {
    void setRace(Race race);
    void setPlayClass(PlayClass playClass);
    void setLevel(int level);
    void setHealth(int health);
    void setMana(int mana);
    void setStrength(int strength);
    void setDexterity(int dexterity);
    void setStamina(int stamina);
}
