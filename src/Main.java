import com.engeto.evidence.*;


public class Main {
    public static void main(String[] args) {
        Guest adela = new Guest("Adéla","Malíková","1993-03-13");
        Guest jan = new Guest("Jan","Dvořáček", "1995-05-05");

        Room one = new Room(1,1,true,true,1000);
        Room two = new Room(2,1,true,true,1000);
        Room three = new Room(3,3,false,true,2400);

        Booking bookingOne = new Booking(adela,one,"2021-07-19","2021-07-26");
        Booking bookingTwo = new Booking(adela,three,"2021-09-01","2021-09-14");

        bookingTwo.addGuests(jan);

        BookingManager bookings = new BookingManager();

        bookings.addBooking(bookingOne);
        bookings.addBooking(bookingTwo);

        bookings.printBookings();





    }
}