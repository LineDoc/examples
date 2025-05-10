package ru.aston.homework.patterns.examples.myStrategy.strategies;

import ru.aston.homework.patterns.examples.myStrategy.data.InternetGameCatalog;
import ru.aston.homework.patterns.examples.myStrategy.exceptions.GameNotFoundException;

public class InternetDownloadStrategy implements DownloadStrategy {

    private int gameSize;

    @Override
    public int getGameSize() {
        return gameSize;
    }

    @Override
    public void downloadGame(String title) {
            checkGame(title);
            gameSize = InternetGameCatalog.GAME_CATALOG.get(title).intValue();
            System.out.println("Loading the game: " + title);
    }

    private void checkGame(String title) throws GameNotFoundException {
        if(title == null || title.equals("")) {
            throw new GameNotFoundException("The Title cannot be Empty!");
        }
        if(!InternetGameCatalog.GAME_CATALOG.containsKey(title)) {
            throw new GameNotFoundException("There is no game with that name in the catalog!");
        }
    }
}
