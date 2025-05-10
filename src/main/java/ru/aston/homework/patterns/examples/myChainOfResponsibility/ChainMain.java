package ru.aston.homework.patterns.examples.myChainOfResponsibility;

import ru.aston.homework.patterns.examples.myChainOfResponsibility.handlers.EventAlarmHandler;
import ru.aston.homework.patterns.examples.myChainOfResponsibility.handlers.Handler;
import ru.aston.homework.patterns.examples.myChainOfResponsibility.handlers.MinorAlarmHandler;
import ru.aston.homework.patterns.examples.myChainOfResponsibility.handlers.WarningAlarmHandler;
import ru.aston.homework.patterns.examples.myChainOfResponsibility.service.Alarm;
import ru.aston.homework.patterns.examples.myChainOfResponsibility.service.Importance;

import java.time.LocalDateTime;
import java.util.Date;

public class ChainMain {
    public static void main(String[] args) {
        Date date = new Date();
        Alarm alarm = new Alarm(Importance.EVENT, LocalDateTime.now());

        Handler handler1 = new EventAlarmHandler(Importance.EVENT.getPriority());
        Handler handler2 = new WarningAlarmHandler(Importance.WARNING.getPriority());
        Handler handler3 = new MinorAlarmHandler(Importance.MINOR.getPriority());

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        handler1.handle(alarm);

    }
}
