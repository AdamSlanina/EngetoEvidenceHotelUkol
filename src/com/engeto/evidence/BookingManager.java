package com.engeto.evidence;


import java.util.ArrayList;

public class BookingManager {
    private final ArrayList<Booking> listOfBookings;

    public BookingManager() {
        this.listOfBookings = new ArrayList<>();
    }

    public void addBooking(Booking booking) {
        this.listOfBookings.add(booking);
    }

    public void printBookings() {
        if (!this.listOfBookings.isEmpty()) {
            for (Booking listOfBooking : this.listOfBookings) {
                System.out.println(listOfBooking);
            }
        } else {
            System.out.println("No reservations currently");
        }
    }
}
