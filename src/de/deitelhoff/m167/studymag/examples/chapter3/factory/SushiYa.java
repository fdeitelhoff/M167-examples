package de.deitelhoff.m167.studymag.examples.chapter3.factory;

public class SushiYa extends Restaurant {

    @Override
    Meal prepareMeal() {
        return new Sushi();
    }
}
