package com.engeto.evidence;

import java.util.HashMap;

public class Hotel {
    private final String hotelName;
    private final HashMap<Integer,Room> hotel;

    public Hotel(String hotelName) {
        this.hotelName = hotelName;
        this.hotel = new HashMap<>();
    }

    public String getHotelName(){
        return this.hotelName;
    }


    public void bookRoom(Booking booking,BookingManager bookingList){
        bookingList.addBooking(booking);


    }

    public void addRoom(Room room){
        hotel.put(room.getRoomNumber(), room);
    }

    public void roomOverview(){
        for (Room roomName : hotel.values()) {
            System.out.println(roomName);
            System.out.println();
        }
    }

    public void specificRoom(int i){
        System.out.println(hotel.get(i));
    }


}
