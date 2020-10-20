package com.lga.pattern.proxy;

public class UserService implements IUserService {

    @Override
    public void login() {
        System.out.println("login...");
    }
}
