package ru.aston.homework.patterns.examples.myStrategy.strategies;

public interface DownloadStrategy {
    int getGameSize();
    void downloadGame(String title);
}
