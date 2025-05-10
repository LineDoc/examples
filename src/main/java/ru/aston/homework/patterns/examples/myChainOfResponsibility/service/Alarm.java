package ru.aston.homework.patterns.examples.myChainOfResponsibility.service;

import java.time.LocalDateTime;

public class Alarm {

    private static int id = 0;

    private final int idEvent;
    private final Importance importance;
    private final LocalDateTime timeOccurrence;

    public Alarm(Importance importance, LocalDateTime timeOccurrence) {
        this.idEvent = id;
        id++;
        this.importance = importance;
        this.timeOccurrence = timeOccurrence;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public Importance getImportance() {
        return importance;
    }
    public LocalDateTime getTimeOccurrence() {
        return timeOccurrence;
    }

    @Override
    public String toString() {
        return "----------------------------" + '\n' +
                "ALARM!" + '\n' +
                "ID: " + idEvent + '\n'+
                "Importance: " + importance + '\n' +
                "Time: " + timeOccurrence + '\n' +
                "----------------------------";
    }
}
