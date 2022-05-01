package com.company.observer;

public interface Listener {

    void print(String msg);

    void subscribe(EventManager manager, String action);
    void unsubscribe(EventManager manager, String action);
}
