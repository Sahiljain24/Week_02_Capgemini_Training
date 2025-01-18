public class HotelBooking {
    // Private member variables for booking details
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor - initializes the booking with default values
    public HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor - initializes the booking with user-provided values
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor - creates a new booking with the same details as another booking
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName; // Copies the guest's name
        this.roomType = other.roomType;   // Copies the room type
        this.nights = other.nights;       // Copies the number of nights
    }

    // Getter methods to retrieve booking details
    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNights() {
        return nights;
    }

    // Setter methods to update booking details
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    // Method to display the details of a booking
    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    // Main method to test the HotelBooking class
    public static void main(String[] args) {
        // Creating a booking using the default constructor
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.displayBookingDetails();

        // Creating a booking using the parameterized constructor
        HotelBooking customBooking = new HotelBooking("Alice", "Deluxe", 3);
        System.out.println("\nCustom Booking:");
        customBooking.displayBookingDetails();

        // Creating a booking using the copy constructor
        HotelBooking copyBooking = new HotelBooking(customBooking);
        System.out.println("\nCopied Booking:");
        copyBooking.displayBookingDetails();
    }
}
