package com.lga.pattern.observer;

import com.google.common.eventbus.Subscribe;

public class ObserverOne {

    @Subscribe
    public void handleRegSuccess(SmsMessage message) {
        System.out.println("observer one ...." + message);
    }
}
