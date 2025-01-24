package day_05.hybridInheritance;

/*Sample Problem 2: Vehicle Management System with Hybrid Inheritance
Description: Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle are subclasses. Additionally, create a Refuelable interface implemented by PetrolVehicle.
Tasks:
Define a superclass Vehicle with attributes like maxSpeed and model.
Create an interface Refuelable with a method refuel().
Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, while ElectricVehicle include a charge() method.
Goal: Use hybrid inheritance by having PetrolVehicle implement both Vehicle and Refuelable, demonstrating how Java interfaces allow adding multiple behaviors. */

// Interface: Refuelable
interface Refuelable {
    // Method to refuel the vehicle (only applicable to Petrol vehicles)
    void refuel();
}

// Base class: Vehicle
class Vehicle {
    // Common attributes for all vehicles
    String model;
    int maxSpeed;

    // Constructor to initialize a Vehicle object
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Method to display common vehicle details
    public void displayVehicleDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Subclass: ElectricVehicle (inherits from Vehicle)
class ElectricVehicle extends Vehicle {
    // Additional attribute for ElectricVehicle
    int batteryCapacity;

    // Constructor to initialize an ElectricVehicle object
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        // Call the superclass constructor to initialize common attributes
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    // Method to display details specific to ElectricVehicle
    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails(); // Call superclass method to display common details
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    // Method to charge the ElectricVehicle
    public void charge() {
        System.out.println(model + " is being charged with a battery capacity of " + batteryCapacity + " kWh.");
    }
}

// Subclass: PetrolVehicle (inherits from Vehicle and implements Refuelable)
class PetrolVehicle extends Vehicle implements Refuelable {
    // Additional attribute for PetrolVehicle
    int fuelTankCapacity;

    // Constructor to initialize a PetrolVehicle object
    public PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        // Call the superclass constructor to initialize common attributes
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    // Method to display details specific to PetrolVehicle
    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails(); // Call superclass method to display common details
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }

    // Implementation of refuel() method from Refuelable interface
    @Override
    public void refuel() {
        System.out.println(model + " is being refueled with " + fuelTankCapacity + " liters of petrol.");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Creating objects for different vehicle types
        ElectricVehicle ev = new ElectricVehicle("alto ", 250, 100);
        PetrolVehicle pv = new PetrolVehicle("nano", 220, 50);

        // Displaying details and performing actions for each vehicle type
        System.out.println("\nElectric Vehicle Details:");
        ev.displayVehicleDetails();
        ev.charge();

        System.out.println("\nPetrol Vehicle Details:");
        pv.displayVehicleDetails();
        pv.refuel();
    }
}
