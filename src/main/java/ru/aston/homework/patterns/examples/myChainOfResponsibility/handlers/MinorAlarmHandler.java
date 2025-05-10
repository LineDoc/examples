package ru.aston.homework.patterns.examples.myChainOfResponsibility.handlers;

import ru.aston.homework.patterns.examples.myChainOfResponsibility.service.Alarm;

public class MinorAlarmHandler extends Handler {

    public MinorAlarmHandler(int handlerLevel) {
        super(handlerLevel);
    }

    @Override
    public void setNextHandler( Handler nextHandler) {
        super.setNextHandler(nextHandler);
    }

    @Override
    public void handle(Alarm alarm) {
        super.handle(alarm);
    }

    @Override
    public void sendMassage() {
        System.out.println("Attention! Intervention is required!");
    }

    @Override
    protected void fix() {
        System.out.println("I'm looking for the nearest available specialist...");
        try {
            Thread.sleep(500);
            System.out.println("A free specialist has been found and is aimed at eliminating.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fixed!");
    }
}
