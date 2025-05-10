package ru.aston.homework.patterns.examples.myChainOfResponsibility.service;

public enum Importance {
    EVENT(3),
    WARNING(2),
    MINOR(1);


    private int priority;

    Importance(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
