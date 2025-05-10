package ru.aston.homework.patterns.examples.myProxy;

public class ProxyMain {
    public static void main(String[] args) {

        Session session = new ProxyServer();

        Account account1 = new Account("accaunt1@mail.com", "QWERTY1");
        Account account2 = new Account("accaunt2@mail.com", "QWERTY2");
        Account account3 = new Account("accaunt3@mail.com", "QWERTY3");

        Server.registrationAccount(account1);
        session.connect("www.testServer.com", account1);

        Server.registrationAccount(account2);
        session.connect("www.testServer.com", account2);

        Server.registrationAccount(account3);
        session.connect("www.testServer.com", account3);

        session.connect("www.testServer.com", new Account("Qwerty@mail.com", "weqwrewfdf"));


    }
}
