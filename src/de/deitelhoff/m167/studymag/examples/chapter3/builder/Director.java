package de.deitelhoff.m167.studymag.examples.chapter3.builder;

public class Director {

    public Car makeCar(Builder builder) {
        builder.reset();
        builder.setSeats(4);
        builder.setEngine("medium");

        return builder.getResult();
    }

    public Car makeTruck(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("strong");
        builder.setGPS();

        return builder.getResult();
    }
}
