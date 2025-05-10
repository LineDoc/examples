package ru.aston.homework.patterns.examples.myStrategy.data;

import java.util.Map;
import java.util.TreeMap;

public class InternetGameCatalog {

    public static final Map<String, Integer> GAME_CATALOG = new TreeMap<>();

    static {
        GAME_CATALOG.put("Elden Ring", 99);
        GAME_CATALOG.put("Baldur's Gate 3", 76);
        GAME_CATALOG.put("Astro Bot", 1001);
        GAME_CATALOG.put("The Witcher 3: Wild Hunt. Game Of Year Edition", 78);
        GAME_CATALOG.put("The Last Of Us: Part One", 56);
        GAME_CATALOG.put("The Last Of Us: Part Two", 70);
        GAME_CATALOG.put("God of War: Ragnarok", 66);
        GAME_CATALOG.put("Ghost of Tsushima", 67);
    }

    public static void getInternetGameCatalog() {
        for (Map.Entry<String, Integer> catalog : GAME_CATALOG.entrySet()) {
            System.out.println("Title: " + catalog.getKey() + ", size: " + catalog.getValue());
        }
    }

}
