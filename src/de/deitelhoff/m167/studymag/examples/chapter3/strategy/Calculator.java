package de.deitelhoff.m167.studymag.examples.chapter3.strategy;

public class Calculator {

    private CalculatorStrategy strategy;

    public void setStrategy(CalculatorStrategy strategy) {
        this.strategy = strategy;
    }

    public float executeStrategy(float a, float b) {
        return strategy.execute(a, b);
    }
}
