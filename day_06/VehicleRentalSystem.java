// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getters and Setters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);
}

// Interface Insurable
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Car class
class Car extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.05; // 5% of rental cost

    public Car(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1) * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Rate: " + (INSURANCE_RATE * 100) + "% of daily rental cost";
    }
}

// Bike class
class Bike extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.03; // 3% of rental cost

    public Bike(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1) * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Rate: " + (INSURANCE_RATE * 100) + "% of daily rental cost";
    }
}

// Truck class
class Truck extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.1; // 10% of rental cost

    public Truck(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; // Additional fixed charge for trucks
    }

    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1) * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Rate: " + (INSURANCE_RATE * 100) + "% of daily rental cost";
    }
}

// Main class to demonstrate the vehicle rental system
public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Create a list of vehicles
        Vehicle[] vehicles = {
            new Car("C123", "Sedan", 1000),
            new Bike("B456", "Sports Bike", 500),
            new Truck("T789", "Heavy Truck", 3000)
        };

        // Calculate and print rental and insurance costs for each vehicle
        for (Vehicle vehicle : vehicles) {
            int rentalDays = 5; // Example rental period
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            double insuranceCost = 0;

            if (vehicle instanceof Insurable) {
                insuranceCost = ((Insurable) vehicle).calculateInsurance();
                System.out.println(vehicle.getType() + " Insurance Details: " + ((Insurable) vehicle).getInsuranceDetails());
            }

            System.out.println("Vehicle: " + vehicle.getType() + " (" + vehicle.getVehicleNumber() + ")");
            System.out.println("Rental Rate: " + vehicle.getRentalRate());
            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println("Total Cost: " + (rentalCost + insuranceCost));
            System.out.println("------------------------------------");
        }
    }
}
   