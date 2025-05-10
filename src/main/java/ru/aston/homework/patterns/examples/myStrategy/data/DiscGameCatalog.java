package ru.aston.homework.patterns.examples.myStrategy.data;

import java.util.HashSet;
import java.util.Set;


public class DiscGameCatalog {
    public static final Set<Disc> DISC_CATALOG = new HashSet<>();

    static {
        DISC_CATALOG.add(new Disc("Blu-Ray", "The Witcher 3: Wild Hunt. Game Of Year Edition", 78));
        DISC_CATALOG.add(new Disc("DVD", "Dark Souls", 4004));
        DISC_CATALOG.add(new Disc("Blu-Ray", "The Last Of Us: Part One", 70));
        DISC_CATALOG.add(new Disc("Blu-Ray", "The Last Of Us: Part Two", 74));
        DISC_CATALOG.add(new Disc("Blu-Ray", "God of War: Ragnarok", 38));
        DISC_CATALOG.add(new Disc("CD", "God of War", 23));
    }

    public static void getDiscCatalog() {
        for (Disc disc : DISC_CATALOG) {
            System.out.println("Title: " + disc.getTitle() + ", size: " + disc.getRequiredMemorySize() + ", type: " + disc.getDiscType());
        }
    }

    public static Disc getDisc(String title) {
        for (Disc disc : DISC_CATALOG) {
            if(disc.getTitle().equals(title)) {
                return disc;
            }
        } return null;
    }
}
