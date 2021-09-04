package de.deitelhoff.m167.studymag.examples.chapter3.observer;

public class Main {

    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        eventManager.subscribe("email", new EMailAlertsListener());
        eventManager.subscribe("file", new FileSaveListener());

        eventManager.notify("email", "testdatei.txt");
        eventManager.notify("file", "testdatei2.txt");
    }
}
