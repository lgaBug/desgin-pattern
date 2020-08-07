package com.lga.pattern.observer;

import com.google.common.eventbus.Subscribe;

public class ObserverTwo {

    @Subscribe
    public void handleRegSuccess(EmailMessage message) {
        System.out.println("observer two ...." + message);
    }
}
