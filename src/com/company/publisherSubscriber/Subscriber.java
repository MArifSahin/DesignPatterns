package com.company.publisherSubscriber;

import java.util.List;

public class Subscriber {

    public Subscriber(List<Event> dependentEvents) {
        for (Event e : dependentEvents) {
            EventChannel.getInstance().attachSubscriber(this, e);
        }
    }

    public void consume(Event event, String message) {
    }
}