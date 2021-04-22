package com.company.publisherSubscriber;

import java.util.List;

public class SubscriberApp2 extends Subscriber {

    public SubscriberApp2(List<Event> dependentEvents) {
        super(dependentEvents);
    }

    @Override
    public void consume(Event event, String message){
        System.out.println(message);
        System.out.println("App2 consumes event with the changes: " + event.changes);
        System.out.println("App2 changed according to the changes in event. ");
    }
}
