package com.lga.pattern.observer;

public class SmsMessage extends Message {

    public SmsMessage(String name) {
        this.setName(name);
        this.setType(MessageType.sms);
    }

    @Override
    public void sendMessage() {
        System.out.println(this.getType().name() + "-----" + this.getName());
    }
}
