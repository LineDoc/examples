package ru.aston.homework.patterns.examples.myBuilder;

public class Director {
    public void constructHumanWarriorPlayCharacter(Builder builder) {
        builder.setRace(Race.HUMAN);
        builder.setPlayClass(PlayClass.WARRIOR);
        builder.setLevel(1);
        builder.setHealth(100);
        builder.setMana(50);
        builder.setStrength(50);
        builder.setDexterity(50);
        builder.setStamina(100);
    }

    public void constructHumanMagPlayCharacter(Builder builder) {
        builder.setRace(Race.HUMAN);
        builder.setPlayClass(PlayClass.MAG);
        builder.setLevel(1);
        builder.setHealth(100);
        builder.setMana(150);
        builder.setStrength(20);
        builder.setDexterity(50);
        builder.setStamina(100);
    }

    public void constructOrсKnightPlayCharacter(Builder builder) {
        builder.setRace(Race.ORС);
        builder.setPlayClass(PlayClass.KNIGHT);
        builder.setLevel(10);
        builder.setHealth(300);
        builder.setMana(75);
        builder.setStrength(100);
        builder.setDexterity(100);
        builder.setStamina(200);
    }

    public void constructOrcRiflemanPlayCharacter(Builder builder) {
        builder.setRace(Race.ORС);
        builder.setPlayClass(PlayClass.RIFLEMAN);
        builder.setLevel(5);
        builder.setHealth(200);
        builder.setMana(40);
        builder.setStrength(50);
        builder.setDexterity(200);
        builder.setStamina(120);
    }
}
