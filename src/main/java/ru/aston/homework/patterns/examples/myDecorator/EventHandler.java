package ru.aston.homework.patterns.examples.myDecorator;

public class EventHandler implements Handler {
    private final Alarm alarm;

    public EventHandler(Alarm alarm) {
        this.alarm = alarm;
    }

    public String info() {
        return "----------------------------" + '\n' +
                "ALARM!" + '\n' +
                "ID: " + alarm.getId() + '\n'+
                "Importance: " + alarm.getImportance() + '\n' +
                "Time: " + alarm.getTimeOccurrence() + '\n' +
                "Code: " + alarm.getErrorCode() + '\n' +
                "----------------------------";
    }

    public Alarm getAlarm() {
        return alarm;
    }

    @Override
    public void sendMassage() {
        System.out.println("Sending information about the accident to the terminal: " + '\n'
                + info());
    }


}
