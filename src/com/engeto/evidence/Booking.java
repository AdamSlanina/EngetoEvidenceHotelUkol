package com.engeto.evidence;

import java.time.LocalDate;
import java.util.ArrayList;

public class Booking {
    private Guest guest;
    private ArrayList<Guest> moreGuests;
    private Room room;
    private LocalDate startDate;
    private LocalDate endDate;
    private String vacationType;

    public Booking(Guest gThree, Room two, LocalDate localDate, LocalDate localDate1, String recreational) {
        this(gThree,two,localDate.toString(),localDate1.toString(),recreational);
    }
    public Booking(Guest guest, Room room, String startDate, String endDate,String vacationType) {
        this.moreGuests=new ArrayList<>();
        this.moreGuests.add(guest);
        this.guest = guest;
        this.room = room;
        this.startDate = LocalDate.parse(startDate);
        this.endDate = LocalDate.parse(endDate);
        this.vacationType=vacationType;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public ArrayList<Guest> getMoreGuests() {
        return moreGuests;
    }

    public void setMoreGuests(ArrayList<Guest> moreGuests) {
        this.moreGuests = moreGuests;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getVacationType() {
        return vacationType;
    }

    public void setVacationType(String vacationType) {
        this.vacationType = vacationType;
    }



    public void addGuests(Guest guest) {
        this.moreGuests.add(guest);
    }
    public ArrayList<Guest> printGuests(){
        return this.moreGuests;
    }

    @Override
    public String toString() {
        if(this.moreGuests.size()==1){
           return this.startDate+" až "+this.endDate+": "+this.guest+" ["+this.moreGuests.size()+", "+this.room.hasView()+"]"+" za "+room.getPricePerNight();
       }
        return this.startDate+" až "+this.endDate+": "+this.guest+" ["+this.moreGuests.size()+", "+this.room.hasView()+"]"+" za "+room.getPricePerNight();
    }
}
