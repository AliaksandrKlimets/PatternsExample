package com.company.observer;

import java.util.*;

public class EventManager {

    private Map<String, List<Listener>> listeners = new HashMap<>();

    public void subscribe(String action, Listener listener) {
        if (this.listeners.containsKey(action)) {
            List<Listener> listeners = this.listeners.get(action);
            listeners.add(listener);
        } else {
            this.listeners.put(action, new ArrayList<>(Collections.singletonList(listener)));
        }
    }

    public void unsubscribe(String action, Listener listener) {
        this.listeners.get(action).remove(listener);
    }

    public void notify(String action, String msg) {
        if (listeners.get(action) == null || listeners.get(action).isEmpty()) return;
        for (Listener listener : listeners.get(action)) {
            listener.print(msg);
        }
    }

}
