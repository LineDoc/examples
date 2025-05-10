package ru.aston.homework.patterns.examples.myChainOfResponsibility.handlers;

import ru.aston.homework.patterns.examples.myChainOfResponsibility.service.Alarm;

public class EventAlarmHandler extends Handler {

    public EventAlarmHandler(int handlerLevel) {
        super(handlerLevel);
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        super.setNextHandler(nextHandler);
    }

    @Override
    public void handle(Alarm alarm) {
        super.handle(alarm);
    }

    @Override
    public void sendMassage() {
        System.out.println("Please pay attention!");
    }

    @Override
    protected void fix() {
        System.out.println("No intervention is required");
    }
}
