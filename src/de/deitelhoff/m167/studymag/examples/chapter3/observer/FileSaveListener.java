package de.deitelhoff.m167.studymag.examples.chapter3.observer;

public class FileSaveListener implements EventListener {

    @Override
    public void update(String filename) {
        System.out.println("File Save Listener: " + filename);
    }
}
