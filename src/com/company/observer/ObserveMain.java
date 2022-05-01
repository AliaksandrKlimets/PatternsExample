package com.company.observer;

public class ObserveMain {

    public static void main(String[] args) {
        Editor editor = new Editor();

        Listener consoleLog = new ConsoleLog();
        Listener notConsoleLog = new NotConsoleLog();
        EventManager manager = editor.getManager();

        consoleLog.subscribe(manager, "update");
        consoleLog.subscribe(manager, "delete");

        editor.delete();
        editor.update();
    }
}
