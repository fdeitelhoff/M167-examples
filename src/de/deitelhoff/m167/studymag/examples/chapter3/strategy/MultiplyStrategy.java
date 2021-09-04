package de.deitelhoff.m167.studymag.examples.chapter3.strategy;

public class MultiplyStrategy implements CalculatorStrategy {

    @Override
    public float execute(float a, float b) {
        return a * b;
    }
}

