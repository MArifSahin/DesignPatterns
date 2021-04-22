package com.company.publisherSubscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventChannel {
    public HashMap<Event, List<Subscriber>> dependents = new HashMap<>();
    private List<Publisher> publishers = new ArrayList<>();

    private static EventChannel eventChannel;

    public static EventChannel getInstance() {
        if (eventChannel == null) {
            eventChannel = new EventChannel();
        }
        return eventChannel;
    }

    public void triggerEvent(Event event, String message) {
        List<Subscriber> subs = dependents.get(event);
        for (Subscriber s : subs) {
            s.consume(event, message);
        }
    }

    public void attachSubscriber(Subscriber s, Event e) {
        dependents.get(e).add(s);
    }

    public void detachSubscriber(Subscriber s, Event e) {
        dependents.get(e).remove(s);
    }

    public void attachPublisher(Publisher p){
        publishers.add(p);
    }
    public void detachPublisher(Publisher p){
        publishers.remove(p);
    }
}
