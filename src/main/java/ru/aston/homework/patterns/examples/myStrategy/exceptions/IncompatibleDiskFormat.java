package ru.aston.homework.patterns.examples.myStrategy.exceptions;

public class IncompatibleDiskFormat extends RuntimeException {
    public IncompatibleDiskFormat(String message) {
        super(message);
    }
}
