package day_05.singleInheritance;
/*
 Sample Problem 2: Smart Home Devices
Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
Tasks:
Define a superclass Device with attributes like deviceId and status.
Create a subclass Thermostat with additional attributes like temperatureSetting.
Implement a method displayStatus() to show each device's current settings.
Goal: Understand single inheritance by adding specific attributes to a subclass, keeping the superclass general.

 */
// Superclass: Device
public class Device {
    // Attributes of the Device class
    String deviceId;
    String status;

    // Constructor to initialize the Device object
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display the status of the device
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Device Status: " + status);
    }
}

// Subclass: Thermostat (inherits from Device)
class Thermostat extends Device {
    // Additional attribute specific to Thermostat
    int temperatureSetting;

    // Constructor to initialize the Thermostat object
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        // Call the superclass constructor to initialize the Device attributes
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Method to display the status of the thermostat, including the temperature setting
    @Override
    public void displayStatus() {
        super.displayStatus(); // Call the superclass method to display basic device info
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

 class SmartHomeSystem {
    public static void main(String[] args) {
        // Creating a Thermostat object with device and thermostat details
        Thermostat thermostat = new Thermostat("143", "hot", 44);
        
        // Displaying the thermostat's current settings
        thermostat.displayStatus();
    }
}
