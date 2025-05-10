package ru.aston.homework.patterns.examples.myDecorator;

import ru.aston.homework.patterns.examples.myDecorator.decorators.SMSEventHandlerDecorator;
import ru.aston.homework.patterns.examples.myDecorator.decorators.SoundEventHandlerDecorator;

import java.time.LocalDateTime;
import java.util.Date;

public class DecoratorMain {
    public static void main(String[] args) {
        Date date = new Date();
        Alarm alarm = new Alarm(1, "CRITICAL", LocalDateTime.now(), "4FRT");
        EventHandler eventHandler = new EventHandler(alarm);

        Handler decorHandlerOne = new EventHandler(alarm);
        decorHandlerOne.sendMassage();

        Handler decorHandlerTwo = new SoundEventHandlerDecorator(new EventHandler(alarm));
        decorHandlerTwo.sendMassage();

        Handler decorHandlerThree = new SMSEventHandlerDecorator(new SoundEventHandlerDecorator(new EventHandler(alarm)));
        decorHandlerThree.sendMassage();
    }
}
