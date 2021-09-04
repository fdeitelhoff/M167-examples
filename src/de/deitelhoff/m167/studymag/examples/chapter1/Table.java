package de.deitelhoff.m167.studymag.examples.chapter1;

public class Table extends GeometricalFigure implements Transportable {

    @Override
    public float weight() {
        System.out.println(MAX_WEIGHT_PER_AREA);
        return 100;
    }

    @Override
    public float length() {
        return 50;
    }

    @Override
    public float width() {
        return 20;
    }

    @Override
    public float height() {
        return 30;
    }

    @Override
    public double calculateArea() {
        return width() * height();
    }
}
