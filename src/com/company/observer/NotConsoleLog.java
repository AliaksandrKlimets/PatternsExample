package com.company.observer;

public class NotConsoleLog implements Listener {

    @Override
    public void print(String msg) {
        System.out.println("NOT CONSOLE LOG " + msg);
    }

    @Override
    public void subscribe(EventManager manager, String action) {
        manager.subscribe(action, this);
    }

    @Override
    public void unsubscribe(EventManager manager, String action) {
        manager.unsubscribe(action, this);
    }
}
