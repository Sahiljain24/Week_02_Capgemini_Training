// Vehicle class
public class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;
    
    // Class variable (shared among all instances)
    public static double registrationFee = 500.00; // Fixed registration fee for all vehicles

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class method to update the registration fee (affects all instances)
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method to test the Vehicle class
    public static void main(String[] args) {
        // Create Vehicle objects
        Vehicle vehicle1 = new Vehicle("Alice", "Car");
        Vehicle vehicle2 = new Vehicle("Bob", "Motorcycle");

        // Display vehicle details before updating the registration fee
        System.out.println("Before updating registration fee:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        // Update the registration fee using the class method
        Vehicle.updateRegistrationFee(600.00);

        // Display vehicle details after updating the registration fee
        System.out.println("\nAfter updating registration fee:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
