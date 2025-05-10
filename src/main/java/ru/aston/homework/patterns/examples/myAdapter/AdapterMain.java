package ru.aston.homework.patterns.examples.myAdapter;

public class AdapterMain {
    public static void main(String[] args) {
        DigitalConsole digitalConsole = new DigitalConsole("SONY", "PS5 Slim", "White", "AMD", 16, 1000);
        DiskDriveAdapter diskDriveAdapter = new DiskDriveAdapter(digitalConsole);
        diskDriveAdapter.downloadingGames("THE LAST OF US: PART 2");
        digitalConsole.startGame("THE LAST OF US: PART 2");
    }
}
