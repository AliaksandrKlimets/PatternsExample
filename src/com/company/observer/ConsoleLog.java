package com.company.observer;

public class ConsoleLog implements Listener {

    @Override
    public void print(String msg) {
        System.out.println("CONSOLE ACTION " + msg);
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
