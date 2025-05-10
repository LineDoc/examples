package ru.aston.homework.patterns.examples.myStrategy.exceptions;

public class InsufficientDiskSpaceException extends RuntimeException {
    public InsufficientDiskSpaceException(String message) {
        super(message);
    }
}
