package com.engeto.evidence;

import java.time.LocalDate;
import java.util.ArrayList;

public class Booking {
    private Guest guest;
    private ArrayList<Guest> moreGuests;
    private Room room;
    private LocalDate startDate;
    private LocalDate endDate;

    public Booking(Guest guest, Room room, String startDate, String endDate) {
        this.moreGuests=new ArrayList<>();
        this.moreGuests.add(guest);
        this.guest = guest;
        this.room = room;
        this.startDate = LocalDate.parse(startDate);
        this.endDate = LocalDate.parse(endDate);
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
           return "Guests: "+this.guest+" Room: "+this.room;
       }
       return "Guests: "+this.moreGuests+" Room: "+this.room;
    }
}
