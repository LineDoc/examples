package ru.aston.homework.patterns.examples.myChainOfResponsibility.handlers;

import ru.aston.homework.patterns.examples.myChainOfResponsibility.service.Alarm;

public class WarningAlarmHandler extends Handler {
    public WarningAlarmHandler(int handlerLevel) {
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
        System.out.println("AAttention!");
    }

    @Override
    protected void fix() {
        System.out.println("An attempt to eliminate remotely...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("Fixed!");
    }
}
