package ru.aston.homework.patterns.examples.myDecorator.decorators;

import ru.aston.homework.patterns.examples.myDecorator.Handler;

public class SoundEventHandlerDecorator extends EventHandlerDecorator {

    public SoundEventHandlerDecorator(Handler handler) {
        super(handler);
    }

    @Override
    public void sendMassage() {
        super.sendMassage();
        System.out.println("Sound alarm system: ON");
    }

}
