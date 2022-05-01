package com.company.observer;

public class Editor {

    private EventManager manager;

    public Editor() {
        this.manager = new EventManager();
    }

    public void delete() {
        this.manager.notify("delete", "Action deleted");
    }

    public void update() {
        this.manager.notify("update", "Action updated");
    }

    public EventManager getManager() {
        return manager;
    }
}
