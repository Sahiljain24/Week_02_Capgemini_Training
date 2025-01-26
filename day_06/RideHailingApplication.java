// Abstract Class Vehicle
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Abstract method to calculate fare
    public abstract double calculateFare(double distance);

    // Concrete method to get vehicle details
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per Km: " + ratePerKm;
    }

    // Getter and Setter methods for encapsulation
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }
}

// Interface GPS
interface GPS {
    String getCurrentLocation();  // Method to get the current location of the vehicle
    void updateLocation(String location);  // Method to update the vehicle's location
}

// Class Car extends Vehicle and implements GPS
class Car extends Vehicle implements GPS {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    // Overriding the calculateFare method
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;  // Fare calculation for car
    }

    // Implementing GPS interface methods
    @Override
    public String getCurrentLocation() {
        return "Current location of Car: GPS Coordinates";
    }

    @Override
    public void updateLocation(String location) {
        System.out.println("Car location updated to: " + location);
    }
}

// Class Bike extends Vehicle and implements GPS
class Bike extends Vehicle implements GPS {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    // Overriding the calculateFare method
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;  // Fare calculation for bike
    }

    // Implementing GPS interface methods
    @Override
    public String getCurrentLocation() {
        return "Current location of Bike: GPS Coordinates";
    }

    @Override
    public void updateLocation(String location) {
        System.out.println("Bike location updated to: " + location);
    }
}

// Class Auto extends Vehicle and implements GPS
class Auto extends Vehicle implements GPS {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    // Overriding the calculateFare method
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20;  // Auto fare includes a fixed additional charge
    }

    // Implementing GPS interface methods
    @Override
    public String getCurrentLocation() {
        return "Current location of Auto: GPS Coordinates";
    }

    @Override
    public void updateLocation(String location) {
        System.out.println("Auto location updated to: " + location);
    }
}

// RideHailingApp class to demonstrate polymorphism and calculate fares for different vehicle types
class RideHailingApp {
    public void calculateFareForVehicle(Vehicle vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails());
        double fare = vehicle.calculateFare(distance);
        System.out.println("Fare for " + vehicle.getClass().getSimpleName() + ": " + fare);

        // Check if the vehicle implements GPS and display/update its location
        if (vehicle instanceof GPS) {
            GPS gpsVehicle = (GPS) vehicle;
            System.out.println(gpsVehicle.getCurrentLocation());
            gpsVehicle.updateLocation("New Location");
        }
    }
}

// Main Class
public class RideHailingApplication {
    public static void main(String[] args) {
        // Creating objects for Car, Bike, and Auto
        Vehicle car = new Car("V001", "John", 15.0);
        Vehicle bike = new Bike("V002", "Alex", 8.0);
        Vehicle auto = new Auto("V003", "Raj", 10.0);

        // Creating RideHailingApp object to process fares
        RideHailingApp rideHailingApp = new RideHailingApp();

        // Calculating fare for car
        System.out.println("\nCalculating fare for Car (Distance: 10 km):");
        rideHailingApp.calculateFareForVehicle(car, 10);

        // Calculating fare for bike
        System.out.println("\nCalculating fare for Bike (Distance: 10 km):");
        rideHailingApp.calculateFareForVehicle(bike, 10);

        // Calculating fare for auto
        System.out.println("\nCalculating fare for Auto (Distance: 10 km):");
        rideHailingApp.calculateFareForVehicle(auto, 10);
    }
}
