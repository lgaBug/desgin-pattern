package com.lga.pattern.prototype;

import com.lga.pattern.prototype.utils.ObjectUtils;

import java.io.IOException;

public class PrototypePattern01  {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User user = new User("lga", 23, new Company("ygsoft"));
        User user1 = null;
        user1 = (User)ObjectUtils.deepClone(user);
        System.out.println("user = " + user);
        System.out.println("user1 = " + user1);
        System.out.println("(user==user1) = " + (user == user1));
    }
}
