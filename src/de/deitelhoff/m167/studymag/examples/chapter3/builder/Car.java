package de.deitelhoff.m167.studymag.examples.chapter3.builder;

public class Car {

    public int seats;
    public String engine;
    public boolean hasGPS;

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine='" + engine + '\'' +
                ", hasGPS=" + hasGPS +
                '}';
    }
}
