package ru.aston.homework.patterns.examples.myProxy;

public class ProxyServer implements Session {
    private Server server;

    @Override
    public boolean connect(String url, Account account) {
        if (server == null) {
            server = new Server();
        }
        if(server.connect(url, account)) {
            System.out.println("The connection is established!");
            return true;
        }
        System.out.println("Connection error! Check the login details!");
        return false;
    }



}
