package ru.aston.homework.patterns.examples.myStrategy.strategies;

import ru.aston.homework.patterns.examples.myStrategy.data.Disc;
import ru.aston.homework.patterns.examples.myStrategy.data.DiscGameCatalog;
import ru.aston.homework.patterns.examples.myStrategy.exceptions.GameNotFoundException;
import ru.aston.homework.patterns.examples.myStrategy.exceptions.IncompatibleDiskFormat;

public class DiscDownloadStrategy implements DownloadStrategy {

    private Disc disc;
    private int gameSize;

    @Override
    public int getGameSize() {
        return gameSize;
    }

    @Override
    public void downloadGame(String title) {
        setDisc(title);
        checkGameDisc(disc);
        if (checkCompatibility()) {
            gameSize = disc.getRequiredMemorySize();
            System.out.println("Disk in the drive. The download is in progress...");
        }
    }

    private void setDisc(String title) {
        disc = DiscGameCatalog.getDisc(title);
    }

    private void checkGameDisc(Disc disc) throws GameNotFoundException {
        if(!DiscGameCatalog.DISC_CATALOG.contains(disc)) {
            throw new GameNotFoundException("There is no game with that name in the catalog!");
        }
    }

    private boolean checkCompatibility() throws IncompatibleDiskFormat {
        if(!(disc.getDiscType().equals("DVD") || disc.getDiscType().equals("Blu-Ray"))) {
            throw new IncompatibleDiskFormat("Unsupported disk type!");
        }
        return true;
    }
}
