package com.company.publisherSubscriber;

import java.util.List;

public class Event {
    List<String> changes;
    public Event(List<String> changes) {
        this.changes = changes;
    }
}
