package ru.aston.homework.patterns.examples.myAdapter;

import java.util.Set;
import java.util.TreeSet;


/**
 * Класс {@link #DigitalConsole DigitalConsole} описывает игровую приставку цифрового исполнения
 * (без встроенного дисковода) с возможностью подключения внешнего дисковода (должен поддерживать технологию Blu-Ray).
 * Без подключённого дисковода загрузка игр (метод {@link #downloadingGames(String) dowloadingGames()})
 * возможна только из сети.
 *
 */
public class DigitalConsole {
    private final String manufacturer;
    private final String model;
    private final String color;
    private final String processor;
    private final int ram;
    private final int memory;

    private Set<String> gameLibrary = new TreeSet<>();

    public DigitalConsole(String manufacturer, String model, String color, String processor, int ram, int memory) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.processor = processor;
        this.ram = ram;
        this.memory = memory;
    }

    public boolean startGame(String title) {
        if(checkGameLibrary(title)) {
            System.out.println("Launching the game: " + title);
            return true;
        }
        return false;
    }

    private boolean checkGameLibrary(String title) {
        if (gameLibrary.isEmpty()) {
            System.out.println("There are no games in the library yet...");
            return false;
        } else if (!gameLibrary.contains(title)) {
            System.out.println("There is no such game in the library.");
            return false;
        }
        return true;
    }

    public void downloadingGames(String title) {
        System.out.println("Loading the game: " + title);
        gameLibrary.add(title);
        System.out.println("The download is completed!");
    }

    public Set<String> getGameLibrary() {
        return gameLibrary;
    }

    @Override
    public String toString() {
        return "Digital Console Info" + '\n' +
                "Manufacturer: " + manufacturer + '\n' +
                "Model: " + model + '\n' +
                "Color: " + color + '\n' +
                "Processor: " + processor + '\n' +
                "RAM: " + ram + '\n' +
                "Memory: " + memory;
    }
}
