import com.engeto.evidence.*;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        BookingManager manager = new BookingManager();
        fillBookings(manager);
        printBookings(manager);

        System.out.println();

        manager.printEightRecreationalBookings();

        System.out.println();

        printGuestStatistics(manager);

    }

    public static void fillBookings(BookingManager manager){
        Room one = new Room(1,1,true,true,1000);
        Room two = new Room(2,1,true,true,1000);
        Room three = new Room(3,3,false,true,2400);

        Guest gOne = new Guest("Karel","Dvořák","1990-05-15");
        Guest gTwo = new Guest("Karel","Dvořák","1979-01-03");
        Guest gThree = new Guest("Karolina","Tmavá","1990-03-25");

        Booking bOne = new Booking(gOne,three,"2023-06-01","2023-06-07","Work");
        Booking bTwo = new Booking(gTwo,two,"2023-07-18","2023-07-21","Recreational");

        manager.addBooking(bOne);
        manager.addBooking(bTwo);

        Booking KTOne = new Booking(gThree,two,"2023-08-01","2023-08-02","Recreational");
        manager.addBooking(KTOne);

        int helper = 2;
        for(int i = 0; i<=10; i++){
            manager.addBooking(new Booking(gThree,two, KTOne.getStartDate().plusDays(helper),KTOne.getEndDate().plusDays(helper),"Recreational"));
            helper+=2;
        }
        Booking KT = new Booking(gThree,three,"2023-08-01","2023-08-31","Recreational");
        manager.addBooking(KT);
    }

    public static void printBookings(BookingManager manager){
        manager.printBookings();
    }

    public static void printGuestStatistics(BookingManager manager){

        System.out.print("One guest reservations: ");
        manager.oneGuestReservations();

        System.out.print("Two guest reservations: ");
        manager.twoGuestReservations();

        System.out.print("More than two guest reservations: ");
        manager.moreGuestReservations();

    }

}