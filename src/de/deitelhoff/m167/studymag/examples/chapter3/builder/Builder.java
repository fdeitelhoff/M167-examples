package de.deitelhoff.m167.studymag.examples.chapter3.builder;

public interface Builder {

    void reset();
    void setSeats(int number);
    void setEngine(String engine);
    void setGPS();

    Car getResult();
}
