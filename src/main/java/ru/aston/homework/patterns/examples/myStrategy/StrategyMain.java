package ru.aston.homework.patterns.examples.myStrategy;

public class StrategyMain {
    public static void main(String[] args) {

        GameConsole gameConsole = new GameConsole("SONY", "PS5 Slim", "White", "AMD", 16, 1000);

        gameConsole.downloadMenu();

    }
}
