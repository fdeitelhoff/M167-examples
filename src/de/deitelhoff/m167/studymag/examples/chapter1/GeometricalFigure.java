package de.deitelhoff.m167.studymag.examples.chapter1;

import java.awt.*;

public abstract class GeometricalFigure {

    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double calculateArea();
}
