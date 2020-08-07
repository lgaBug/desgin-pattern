package com.lga.pattern.observer;

public class EmailMessage extends Message {

    public EmailMessage(String name) {
        this.setName(name);
        this.setType(MessageType.email);
    }

    @Override
    public void sendMessage() {
        System.out.println(this.getType().name() + "-----" + this.getName());
    }
}
