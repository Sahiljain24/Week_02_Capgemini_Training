package day_05.assistedProblems;
/*Vehicle and Transport System
Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are subclasses with unique attributes.
Tasks:
Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
Goal: Understand how inheritance helps in organizing shared and unique features across subclasses and use polymorphism for dynamic method calls.
 */

// Superclass: Vehicle
public class Vehicle {
    int maxSpeed;
    String fuelType;

    // Constructor
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display vehicle info
    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass: Car
class Car extends Vehicle {
    int seatCapacity;

    // Constructor
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType); // Call superclass constructor
        this.seatCapacity = seatCapacity;
    }

    // Overriding displayInfo() method
    @Override
    void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Subclass: Truck
class Truck extends Vehicle {
    double loadCapacity; // in tons

    // Constructor
    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType); // Call superclass constructor
        this.loadCapacity = loadCapacity;
    }

    // Overriding displayInfo() method
    @Override
    void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Load Capacity: " + loadCapacity + " kgs");
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    boolean hasSidecar;

    // Constructor
    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType); // Call superclass constructor
        this.hasSidecar = hasSidecar;
    }

    // Overriding displayInfo() method
    @Override
    void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

// Main Class
 class VehicleMain {
    public static void main(String[] args) {
        // Array of Vehicle type to store different subclass objects
        Vehicle[] vehicles = new Vehicle[3];

        // Creating objects of subclasses
        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 15);
        vehicles[2] = new Motorcycle(100, "Petrol", false);

        // Displaying details of each vehicle using polymorphism
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Details:");
            vehicle.displayInfo(); // Dynamic method dispatch
           
        }
    }
}
