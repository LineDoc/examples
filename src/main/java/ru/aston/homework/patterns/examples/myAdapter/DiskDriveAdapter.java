package ru.aston.homework.patterns.examples.myAdapter;

/**
 * Класс {@link #DiskDriveAdapter DiskDraveAdapter} описывает подключаемый внешний дисковод
 * с поддержкой технологии Blu-ray (интерфейс {@link ReadingBluRayDisk}) и, в данном примере, выступает Адаптером
 * между консолью и оптическими дисками.
 */
public class DiskDriveAdapter implements ReadingBluRayDisk {
    DigitalConsole digitalConsole;

    public DiskDriveAdapter(DigitalConsole digitalConsole) {
        this.digitalConsole = digitalConsole;
    }

    @Override
    public void downloadingGames(String diskTitle) {
        digitalConsole.downloadingGames(diskTitle);
    }
}
