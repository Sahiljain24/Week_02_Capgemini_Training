// CarRental class
public class CarRental {
    // Instance variables
    private String customerName;
    private String carModel;
    private int rentalDays;
    
    // Static variable to hold the daily rental cost for all cars
    public static final double DAILY_RENTAL_COST = 50.00;

    // Default constructor (if no details are provided)
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Unknown Model";
        this.rentalDays = 0;
    }

    // Parameterized constructor (to initialize rental details)
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate the total rental cost
    public double calculateTotalCost() {
        return rentalDays * DAILY_RENTAL_COST;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    // Main method to test the CarRental class
    public static void main(String[] args) {
        // Creating a CarRental object with the parameterized constructor
        CarRental rental1 = new CarRental("Alice", "Toyota Camry", 5);
        rental1.displayRentalDetails();

        // Creating a CarRental object with the default constructor
        CarRental rental2 = new CarRental();
        rental2.displayRentalDetails();
    }
}
