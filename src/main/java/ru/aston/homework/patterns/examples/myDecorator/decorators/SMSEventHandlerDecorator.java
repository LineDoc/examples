package ru.aston.homework.patterns.examples.myDecorator.decorators;

import ru.aston.homework.patterns.examples.myDecorator.Handler;

public class SMSEventHandlerDecorator extends EventHandlerDecorator {
    public SMSEventHandlerDecorator(Handler handler) {
        super(handler);
    }

    @Override
    public void sendMassage() {
        super.sendMassage();
        System.out.println("I am sending SMS messages to the management...");
    }
}
