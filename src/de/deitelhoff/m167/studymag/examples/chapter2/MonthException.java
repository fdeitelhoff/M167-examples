package de.deitelhoff.m167.studymag.examples.chapter2;

public class MonthException extends RuntimeException {

    private int month;

    public MonthException(int month) {
        super("The month is invalid!");
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
