package ru.aston.homework.patterns.examples.myStrategy.data;

public class Disc {
    private final String discType;
    private String title;
    private int requiredMemorySize;

    public Disc(String discType, String title, int requiredMemorySize) {
        this.discType = discType;
        this.title = title;
        this.requiredMemorySize = requiredMemorySize;
    }

    public String getTitle() {
        return title;
    }

    public int getRequiredMemorySize() {
        return requiredMemorySize;
    }

    public String getDiscType() {
        return discType;
    }
}
