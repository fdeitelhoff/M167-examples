package de.deitelhoff.m167.studymag.examples.chapter6;

import de.deitelhoff.m167.studymag.examples.chapter1.Rectangle;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @org.junit.jupiter.api.Test
    void rectangleConstructor() {
        // Arrange
        double expectedWidth = 20;
        double expectedHeight = 45;

        // Act
        Rectangle rectangle = new Rectangle(20, 45);
        double resultingWidth = rectangle.getWidth();
        double resultingHeight = rectangle.getHeight();

        // Assert
        assertEquals(expectedWidth, resultingWidth);
        assertEquals(expectedHeight, resultingHeight);
    }

    @org.junit.jupiter.api.Test
    void calculateArea() {
        // Arrange
        Rectangle rectangle = new Rectangle(10, 15);
        double expectedArea = 150;

        // Act
        double resultingArea = rectangle.calculateArea();

        // Assert
        assertEquals(expectedArea, resultingArea);
    }

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}