package org.mytests.entities;


public class User {


    public static final User DEFAULT_USER = new User();

    public String login = "epam";
    public String password = "1234";


    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {

        return login + ", "+ password;
    }
}