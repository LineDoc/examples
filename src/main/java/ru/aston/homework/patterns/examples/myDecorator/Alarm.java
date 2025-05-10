package ru.aston.homework.patterns.examples.myDecorator;

import java.time.LocalDateTime;

public class Alarm {

    private final int id;
    private final String importance;
    private final LocalDateTime timeOccurrence;
    private final String errorCode;

    public Alarm(int id, String importance, LocalDateTime timeOccurrence, String errorCode) {
        this.id = id;
        this.importance = importance;
        this.timeOccurrence = timeOccurrence;
        this.errorCode = errorCode;
    }

    public int getId() {
        return id;
    }

    public String getImportance() {
        return importance;
    }

    public LocalDateTime getTimeOccurrence() {
        return timeOccurrence;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
