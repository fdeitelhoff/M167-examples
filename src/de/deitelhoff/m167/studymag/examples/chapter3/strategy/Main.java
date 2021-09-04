package de.deitelhoff.m167.studymag.examples.chapter3.strategy;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setStrategy(new MultiplyStrategy());
        var result = calculator.executeStrategy(5, 5);

        calculator.setStrategy(new DivisionStrategy());

        result = calculator.executeStrategy(result, 10);

        System.out.println("Das Resultat der Berechnungen ist: " + result);
    }
}
