package de.deitelhoff.m167.studymag.examples.chapter4;

public class ShoppingCard {

    public double calculateTotal(double quantity, double itemPrice) {
        if (basePrice(quantity, itemPrice) > 1000) {
            return basePrice(quantity, itemPrice) * 0.95;
        }
        else {
            return basePrice(quantity, itemPrice) * 0.98;
        }
    }

    public double basePrice(double quantity, double itemPrice) {
        return quantity * itemPrice;
    }
}
