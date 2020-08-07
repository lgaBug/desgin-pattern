package com.lga.pattern.observer;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

import java.util.List;
import java.util.concurrent.Executors;

public class UserController {

    private EventBus eventBus = new AsyncEventBus(Executors.newFixedThreadPool(8));

    private Message message;

    public void setMessage(Message message) {
        this.message = message;
    }

    //注册观察者
    public void setObservers(List<Object> observers) {
        for (Object observer : observers) {
            eventBus.register(observer);
        }
    }

    public void register() {
        System.out.println("注册完成。。。");
        //发送消息
        eventBus.post(message);
    }
}
