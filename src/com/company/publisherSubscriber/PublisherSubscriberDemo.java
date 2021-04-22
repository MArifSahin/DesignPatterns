package com.company.publisherSubscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PublisherSubscriberDemo {

    public static void main(String[] args){
        List<String> changes = new ArrayList<String>();
        changes.add("User's genre preferences changed");
        changes.add("User's age changed");
        Event event = new Event(changes);


        List<String> changes1 = new ArrayList<String>();
        changes1.add("User's watchlist changed");
        changes1.add("User's screen settings changed");
        Event event1 = new Event(changes1);

        List<Event> dependentEvents = new ArrayList<>();
        Publisher publisher = new Publisher(event);
        Subscriber subscriber1 = new SubscriberApp1(dependentEvents);
        Subscriber subscriber2 = new SubscriberApp2(dependentEvents);

        EventChannel eventChannel = new EventChannel();
        eventChannel.dependents = new HashMap<>();
        eventChannel.dependents.put(event, new ArrayList<>());
        eventChannel.dependents.put(event1, new ArrayList<>());
        eventChannel.attachPublisher(publisher);
        eventChannel.attachSubscriber(subscriber1, event);
        eventChannel.attachSubscriber(subscriber1, event1);

        eventChannel.attachSubscriber(subscriber2, event1);
        System.out.println("Events are stored in event-channel");


        eventChannel.triggerEvent(event, "Event0 triggered");
        System.out.println();
        eventChannel.triggerEvent(event1, "Event1 triggered");

     

    }
}
