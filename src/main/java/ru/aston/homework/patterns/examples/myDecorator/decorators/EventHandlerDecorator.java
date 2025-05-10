package ru.aston.homework.patterns.examples.myDecorator.decorators;

import ru.aston.homework.patterns.examples.myDecorator.Handler;

public abstract class EventHandlerDecorator implements Handler {
    protected Handler handler;

    public EventHandlerDecorator(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void sendMassage() {
        handler.sendMassage();
    }
}
