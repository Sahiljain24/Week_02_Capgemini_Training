/*Sample Program 6: Vehicle Registration System
Create a Vehicle class with the following features:
Static:
A static variable registrationFee common for all vehicles.
A static method updateRegistrationFee() to modify the fee.
This:
Use this to initialize ownerName, vehicleType, and registrationNumber in the constructor.
Final:
Use a final variable registrationNumber to uniquely identify each vehicle.
Instanceof:
Check if an object belongs to the Vehicle class before displaying its registration details.
 */
// Class to represent a Vehicle in the registration system
public class Vehicle {

    // Static variable for registration fee (shared by all vehicles)
    private static int registrationFee = 500;

    // Static method to reduce the registration fee
    static void reduceRegistrationFee(int fees) {
        registrationFee -= fees; // Reduce the fee
        if (registrationFee < 0) { // Ensure fee does not go negative
            registrationFee = 0;
        }
        System.out.println("Registration fee reduced. Current fee: $" + registrationFee);
    }

    // Static method to increase the registration fee
    static void increaseRegistrationFee(int fees) {
        registrationFee += fees; // Increase the fee
        System.out.println("Registration fee increased. Current fee: $" + registrationFee);
    }

    // Instance variables for vehicle details
    private String ownerName;      // Name of the vehicle owner
    private String vehicleType;    // Type of the vehicle (e.g., car, bike)
    private final int registrationNumber; // Unique registration number for the vehicle

    // Constructor to initialize vehicle details
    Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;               // Assign the owner's name
        this.vehicleType = vehicleType;           // Assign the vehicle type
        this.registrationNumber = registrationNumber; // Assign the unique registration number
    }

    // Method to display vehicle registration details
    public void displayDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Current Registration Fee: $" + registrationFee);
    }
}

// Main class to demonstrate the Vehicle class
class VehicleMain {
    public static void main(String[] args) {
        // Create a new Vehicle object
        Vehicle car = new Vehicle("Sahil Jain", "Car", 12345);

        // Check if the object 'car' is an instance of the Vehicle class
        if (car instanceof Vehicle) {
            System.out.println("Vehicle registration details:");
            car.displayDetails();
        }

        // Update the registration fee
        Vehicle.reduceRegistrationFee(100); // Reduce fee by $100
        Vehicle.increaseRegistrationFee(50); // Increase fee by $50

        // Create another Vehicle object
        Vehicle bike = new Vehicle("Amit Sharma", "Bike", 54321);

        // Display details for the new vehicle
        if (bike instanceof Vehicle) {
            System.out.println("\nVehicle registration details:");
            bike.displayDetails();
        }
    }
}
