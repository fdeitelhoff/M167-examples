package de.deitelhoff.m167.studymag.examples.chapter1;

public interface Transportable {

    float MAX_WEIGHT_PER_AREA = 19.99F;

    float weight();
    float length();
    float width();
    float height();

    default boolean isWeightExceeded() {
        return weight() > 100000;
    }
}
