package ru.aston.homework.patterns.examples.myBuilder;

public class BuilderMain {
    public static void main(String[] args) {
        Director director = new Director();

        PlayCharacterBuilder builder = new PlayCharacterBuilder();

        director.constructOrсKnightPlayCharacter(builder);
        PlayCharacter playCharacter1 = builder.getPlayCharacter();
        System.out.println(playCharacter1);

        director.constructHumanMagPlayCharacter(builder);
        PlayCharacter playCharacter2 = builder.getPlayCharacter();
        System.out.println(playCharacter2);
    }
}
