package ru.aston.homework.patterns.examples.myProxy;

import java.util.HashSet;
import java.util.Set;

public class Server implements Session {

    private final String URL = "www.testServer.com";
    private static final Set<Account> ACCOUNT_SET = new HashSet<>();

    @Override
    public boolean connect(String url, Account account) {
        if (checkUrl(url) && checkAccount(account)) {
            return true;
        }
        return false;
    }

    public static boolean registrationAccount(Account account) {
        if (checkAccount(account)) {
            System.out.println("Such an account has already been registered!");
            return false;
        }
        if (!checkRegistrationEmail(account)) {
            return false;
        }
        if (!checkRegistrationPassword(account)) {
            return false;
        }
        ACCOUNT_SET.add(account);
        System.out.println("Account is registered!");
        return true;
    }

    private boolean checkUrl(String url) {
        return url.equals(URL);
    }

    private static boolean checkAccount(Account account) {
        return ACCOUNT_SET.contains(account);
    }

    private static boolean checkRegistrationEmail(Account account) {
        return !account.getEmail().isEmpty() &&
                account.getEmail().contains("@") &&
                account.getEmail().length() > 8;
    }

    private static boolean checkRegistrationPassword(Account account) {
        return !account.getPassword().isEmpty() &&
                account.getPassword().length() > 5;
    }
}
