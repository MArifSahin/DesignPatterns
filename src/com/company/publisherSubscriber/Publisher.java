package com.company.publisherSubscriber;

public class Publisher {
    Event event;

    public Publisher(Event e) {
        this.event = e;
    }

    public void publish(String message, EventChannel eventChannel) {
        eventChannel.triggerEvent(event, message);
    }
}
