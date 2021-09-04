package de.deitelhoff.m167.studymag.examples.chapter3.adapter;

public class Main {

    public static void main(String[] args) {
        HotelServiceAdapter hotelService = new HotelServiceAdapter();
        hotelService.countHotels(new String[] { "Region 1", "Region 2" });
    }
}
