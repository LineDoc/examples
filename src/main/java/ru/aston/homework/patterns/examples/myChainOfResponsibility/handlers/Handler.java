package ru.aston.homework.patterns.examples.myChainOfResponsibility.handlers;

import ru.aston.homework.patterns.examples.myChainOfResponsibility.service.Alarm;

public abstract class Handler {
    private Handler nextHandler;
    private final int handlerLevel;

    public Handler(int handlerLevel) {
        this.handlerLevel = handlerLevel;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Alarm alarm) {
        if(handlerLevel == alarm.getImportance().getPriority()) {
            System.out.println(alarm);
            sendMassage();
            try {
                fix();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        if (nextHandler != null) {
            nextHandler.handle(alarm);
        }
    }

    protected abstract void sendMassage();

    protected abstract void fix() throws InterruptedException;






}
