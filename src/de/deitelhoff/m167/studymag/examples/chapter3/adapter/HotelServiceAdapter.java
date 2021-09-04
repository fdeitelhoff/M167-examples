package de.deitelhoff.m167.studymag.examples.chapter3.adapter;

public class HotelServiceAdapter implements HotelService {

    private TrivagoService trivagoService = new TrivagoService();

    @Override
    public int countHotels(String[] regions) {
        return trivagoService.countHotels(String.join(";", regions));
    }
}
