package de.deitelhoff.m167.studymag.examples.chapter3.builder;

public class CarBuilder implements Builder {

    private Car result;

    @Override
    public void reset() {
        result = new Car();
    }

    @Override
    public void setSeats(int number) {
        result.seats = number;
    }

    @Override
    public void setEngine(String engine) {
        result.engine = engine;
    }

    @Override
    public void setGPS() {
        result.hasGPS = true;
    }

    @Override
    public Car getResult() {
        return result;
    }
}
