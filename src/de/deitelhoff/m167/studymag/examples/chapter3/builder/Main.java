package de.deitelhoff.m167.studymag.examples.chapter3.builder;

public class Main {

    public static void main(String[] args) {
        Director carDirector = new Director();
        CarBuilder carBuilder = new CarBuilder();

        Car car = carDirector.makeCar(carBuilder);
        Car truck = carDirector.makeTruck(carBuilder);

        System.out.println(car);
        System.out.println(truck);
    }
}
