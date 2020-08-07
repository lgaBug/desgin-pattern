package com.lga.pattern.observer;

public abstract class Message {

    private String name;
    private MessageType type;

    public abstract void sendMessage();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public enum MessageType {
        email, notification, sms,
    }

    @Override
    public String toString() {
        return "Message{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}

