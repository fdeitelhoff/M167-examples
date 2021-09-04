package de.deitelhoff.m167.studymag.examples.chapter4;

public class Delivery {

    private int numberOfLateDeliveries = 3;

    public int getRating() {
        return numberOfLateDeliveries > 5 ? 2 : 1;
    }
}
