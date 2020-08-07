package com.lga.pattern.observer;

import com.google.common.eventbus.Subscribe;

public class ObserverThree {

    @Subscribe
    public void handleRegSuccess(EmailMessage message) {
        System.out.println("observer three ...." + message);
    }
}
