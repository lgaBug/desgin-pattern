package com.lga.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {

        UserController userController = new UserController();
        SmsMessage smsMeesage = new SmsMessage("短信提醒");
        EmailMessage emailMessage = new EmailMessage("邮件提醒");

        ObserverOne observerOne = new ObserverOne();
        ObserverTwo observerTwo = new ObserverTwo();
        ObserverThree observerThree = new ObserverThree();

        List<Object> observers = new ArrayList<>();
        observers.add(observerOne);
        observers.add(observerTwo);
        observers.add(observerThree);

        userController.setObservers(observers);
        userController.setMessage(emailMessage);

        userController.register();
    }

}
