package com.company.publisherSubscriber;

import java.util.List;

public class SubscriberApp1 extends Subscriber {

    public SubscriberApp1(List<Event> dependentEvents) {
        super(dependentEvents);
    }

    @Override
    public void consume(Event event, String message){
        System.out.println(message);
        System.out.println("App1 consumes event with the changes: " + event.changes);
        System.out.println("App1 changed according to the changes in event. ");
    }
}
