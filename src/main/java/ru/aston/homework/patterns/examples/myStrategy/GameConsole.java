package ru.aston.homework.patterns.examples.myStrategy;

import ru.aston.homework.patterns.examples.myStrategy.data.DiscGameCatalog;
import ru.aston.homework.patterns.examples.myStrategy.data.InternetGameCatalog;
import ru.aston.homework.patterns.examples.myStrategy.exceptions.GameNotFoundException;
import ru.aston.homework.patterns.examples.myStrategy.exceptions.IncompatibleDiskFormat;
import ru.aston.homework.patterns.examples.myStrategy.exceptions.InsufficientDiskSpaceException;
import ru.aston.homework.patterns.examples.myStrategy.strategies.DiscDownloadStrategy;
import ru.aston.homework.patterns.examples.myStrategy.strategies.DownloadStrategy;
import ru.aston.homework.patterns.examples.myStrategy.strategies.InternetDownloadStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/**
 * Класс {@link GameConsole} описывает некоторым образом игровую консоль.
 * Паттерн "Стратегия" реализован в методе {@link #downloadMenu()}. Способ загрузки {@link #downloadStrategy} зависит
 * от выбора пользователя (клиента).
 * При загрузке из сети Интернет {@link InternetDownloadStrategy} производится проверка
 * наличия необходимой игры в каталоге {@link InternetGameCatalog}.
 * При загрузке с диска {@link DiscDownloadStrategy} производится проверка наличия необходимой игры в каталоге
 * {@link DiscGameCatalog} и, если диск найден, его тип (DVD или Blu-Ray).
 * После нахождения необходимой игры производится её загрузка в внутреннюю память консоли {@link #gameLibrary} и уменьшение объёма доступной памяти {@link #memory}.
 */

public class GameConsole {
    private final String manufacturer;
    private final String model;
    private final String color;
    private final String processor;
    private final int ram;
    private int memory;

    private final Map<String, Integer> gameLibrary = new TreeMap<>();

    private DownloadStrategy downloadStrategy;

    public GameConsole(String manufacturer, String model, String color, String processor, int ram, int memory) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.processor = processor;
        this.ram = ram;
        this.memory = memory;
    }

    public void downloadMenu() {
        String selectGame = null;
        System.out.println("""
                Select the type of download:
                \
                1 - Downloading from the Internet
                \
                2 - Downloading from Disk""");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            switch (reader.readLine()) {
                case "1":
                    downloadStrategy = new InternetDownloadStrategy();
                    System.out.println("Select game for download:");
                    InternetGameCatalog.getInternetGameCatalog();
                    selectGame = reader.readLine();
                    break;
                case "2":
                    downloadStrategy = new DiscDownloadStrategy();
                    System.out.println("Select game for download:");
                    DiscGameCatalog.getDiscCatalog();
                    selectGame = reader.readLine();
                    break;
                default:
                    System.out.println("Incorrect upload type is selected!");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            downloadStrategy.downloadGame(selectGame);
            if (!checkGameLibrary(selectGame)) {
                int gameSize = downloadStrategy.getGameSize();
                checkAvailableMemory(gameSize);
                memory -= gameSize;
                gameLibrary.put(selectGame, gameSize);
                System.out.println("The download is complete! Available disk space: " + memory + "GB");
            } else {
                System.out.println("The game is already in the library.");
            }
        } catch (InsufficientDiskSpaceException idse) {
            System.out.println(idse.getMessage());
        } catch (IncompatibleDiskFormat idf) {
            System.out.println(idf.getMessage());
        } catch (GameNotFoundException gnfe) {
            System.out.println(gnfe.getMessage());
        } catch (RuntimeException re) {
            System.out.println(re.getMessage());
        }
    }

    public Map<String, Integer> getGameLibrary() {
        return gameLibrary;
    }

    public boolean startGame(String title) {
        if(gameSelector(title)) {
            System.out.println("Launching the game: " + title);
            return true;
        }
        return false;
    }

    private boolean gameSelector(String title) {
        if (gameLibrary.isEmpty()) {
            System.out.println("There are no games in the library yet...");
            return false;
        } else if (!gameLibrary.containsKey(title)) {
            System.out.println("There is no such game in the library.");
            return false;
        }
        return true;
    }
    
    public void setDownloadStrategy(DownloadStrategy downloadStrategy) {
        this.downloadStrategy = downloadStrategy;
    }

    private void checkAvailableMemory(int gameSize) {
        if (gameSize > memory) {
            throw new InsufficientDiskSpaceException("Insufficient disk space!");
        }
    }

    private boolean checkGameLibrary(String title) {
        return gameLibrary.containsKey(title);
    }

    @Override
    public String toString() {
        return "Game Console Info:" + '\n' +
                "Manufacturer: " + manufacturer + '\n' +
                "Model: " + model + '\n' +
                "Color: " + color + '\n' +
                "Processor: " + processor + '\n' +
                "RAM: " + ram + '\n' +
                "Memory: " + memory;
    }
}
