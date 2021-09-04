package de.deitelhoff.m167.studymag.examples.chapter3.observer;

import java.util.*;

public class EventManager {

    private Map<String, List<EventListener>> subscribers = new HashMap<>();

    public void subscribe(String eventType, EventListener listener) {
        if (!subscribers.containsKey(eventType)) {
            subscribers.put(eventType, new ArrayList<>());
        }

        subscribers.get(eventType).add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        if (subscribers.containsKey(eventType)) {
            subscribers.get(eventType).remove(listener);
        }
    }

    public void notify(String eventType, String data) {
        for (EventListener listener : subscribers.get(eventType)) {
            listener.update(data);
        }
    }
}
