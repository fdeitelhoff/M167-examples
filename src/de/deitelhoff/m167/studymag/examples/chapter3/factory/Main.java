package de.deitelhoff.m167.studymag.examples.chapter3.factory;

public class Main {

    public static void main(String[] args) {
        Meal pizza = new Pizzeria().prepareMeal();
        Meal sushi = new SushiYa().prepareMeal();
    }
}
