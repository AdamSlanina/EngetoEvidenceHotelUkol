package com.engeto.evidence;


import java.util.ArrayList;

public class bookingList {
    private final ArrayList<Booking> listOfBookings;

    public bookingList() {
        this.listOfBookings=new ArrayList<>();
    }

    public void addBooking(Booking booking){
        this.listOfBookings.add(booking);
    }

    public void printBookings(){
        if(!this.listOfBookings.isEmpty()){
            for (Booking listOfBooking : this.listOfBookings) {
                System.out.println(listOfBooking);
            }
        }
    }
}
