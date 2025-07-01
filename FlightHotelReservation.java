import java.util.*;

class TravelBookingSystem {
    private Map<Integer, String> reservations = new HashMap<>();
    private Random random = new Random();

    // Search for flights
    public void searchFlights(String from, String to, String date, int passengers) {
        System.out.println("Searching for flights from " + from + " to " + to + " on " + date + " for " + passengers + " passengers.");
    }

    // Search for hotels
    public void searchHotels(String location, String checkIn, String checkOut, int guests) {
        System.out.println("Searching for hotels in " + location + " from " + checkIn + " to " + checkOut + " for " + guests + " guests.");
    }

    // Book a flight and return confirmation number
    public int bookFlight() {
        int confirmation = generateConfirmation();
        reservations.put(confirmation, "Flight");
        System.out.println("Flight booked! Confirmation number: " + confirmation);
        return confirmation;
    }

    // Book a hotel and return confirmation number
    public int bookHotel() {
        int confirmation = generateConfirmation();
        reservations.put(confirmation, "Hotel");
        System.out.println("Hotel booked! Confirmation number: " + confirmation);
        return confirmation;
    }

    // Cancel a reservation
    public void cancelReservation(int confirmationNumber) {
        if (reservations.containsKey(confirmationNumber)) {
            String type = reservations.get(confirmationNumber);
            reservations.remove(confirmationNumber);
            System.out.println(type + " reservation cancelled. Confirmation number: " + confirmationNumber);
        } else {
            System.out.println("No reservation found with confirmation number " + confirmationNumber + ".");
        }
    }

    // Generate unique 6-digit confirmation number
    private int generateConfirmation() {
        int confirmation;
        do {
            confirmation = 100000 + random.nextInt(900000);
        } while (reservations.containsKey(confirmation));
        return confirmation;
    }
}

public class TravelApp {
    public static void main(String[] args) {
        TravelBookingSystem system = new TravelBookingSystem();

        // Searching
        system.searchFlights("New York", "London", "2022-09-01", 1);
        system.searchHotels("London", "2022-08-01", "2022-09-05", 2);

        // Booking
        int flight1 = system.bookFlight();
        int flight2 = system.bookFlight();
        int hotel1 = system.bookHotel();

        // Cancel attempt (non-existent)
        system.cancelReservation(12345670); // Not booked earlier
    }
}