package de.deitelhoff.m167.studymag.examples.chapter1;

public class Circle extends GeometricalFigure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return 2 * Math.PI * radius * radius;
    }
}
