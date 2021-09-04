package de.deitelhoff.m167.studymag.examples.chapter3.observer;

public class EMailAlertsListener implements EventListener {

    @Override
    public void update(String filename) {
        System.out.println("E-Mail Alerts Listener: " + filename);
    }
}
