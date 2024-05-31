package com.engeto.evidence;


import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Booking> listOfBookings;

    public BookingManager() {
        this.listOfBookings = new ArrayList<>();
    }

    public List<Booking> getListOfBookings() {
        return listOfBookings;
    }

    public void addBooking(Booking booking) {
        this.listOfBookings.add(booking);
    }

    public void getBooking(int i){
        this.listOfBookings.get(i);
    }

    public void clearBookings(){
        this.listOfBookings.clear();
    }

    public int numberOfGuests(){
        int counter = 0;
        for(Booking booking:this.listOfBookings){
            int counterHelper = booking.getMoreGuests().size();
            counter=counter+counterHelper;
        }
        return counter;
    }

    public void getNumberOfWorkingBookings(){
        int counter = 0;
        for(Booking booking:this.listOfBookings){
            if(booking.getVacationType().contains("Pracovní")){
                counter++;
            }
        }
        System.out.println(counter);
    }
    public void getNumberOfRecreationalBookings(){
        int counter = 0;
        for(Booking booking:this.listOfBookings){
            if(booking.getVacationType().contains("Rekreační")){
                counter++;
            }
        }
        System.out.println(counter);
    }

    public void getAverageGuests(){
        double guests = numberOfGuests()*1.0;
        double bookings = this.listOfBookings.size()*1.0;
        double averageGuests = guests/bookings;
        System.out.println(averageGuests);
    }

    public void printEightRecreationalBookings() {
        int helper = 0;
        for (Booking booking : this.listOfBookings) {
            if (booking.getVacationType().equals("Recreational")&&helper<8) {
                System.out.println(booking);
                helper++;
            }
        }
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

    public void oneGuestReservations(){
        int helper = 0;
        for(Booking booking : this.listOfBookings){
            if(booking.getMoreGuests().size()==1){
                helper++;
            }
        }
        System.out.println(helper);
    }
    public void twoGuestReservations(){
        int helper = 0;
        for(Booking booking : this.listOfBookings){
            if(booking.getMoreGuests().size()==2){
                helper++;
            }
        }
        System.out.println(helper);
    }

    public void moreGuestReservations(){
        int helper = 0;
        for(Booking booking : this.listOfBookings){
            if(booking.getMoreGuests().size()>2){
                helper++;
            }
        }
        System.out.println(helper);
    }
}

