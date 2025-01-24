package day_05.hybridInheritance;
/*Sample Problem 1: Restaurant Management System with Hybrid Inheritance
Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses. Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
Tasks:
Define a superclass Person with attributes like name and id.
Create an interface Worker with a method performDuties().
Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, each providing a unique implementation of performDuties().
Goal: Practice hybrid inheritance by combining inheritance and interfaces, giving multiple behaviors to the same objects. */


// Interface: Worker
interface Worker {
    // Method to be implemented by classes that perform duties
    void performDuties();
}

// Base class: Person
class Person {
    // Common attributes for all persons
    String name;
    int id;

    // Constructor to initialize a Person object
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display common person details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Subclass: Chef (inherits from Person and implements Worker)
class Chef extends Person implements Worker {
    // Additional attribute for Chef
    String specialty;

    // Constructor to initialize a Chef object
    public Chef(String name, int id, String specialty) {
        // Call the superclass constructor to initialize common attributes
        super(name, id);
        this.specialty = specialty;
    }

    // Method to display details specific to a Chef
    @Override
    public void displayPersonDetails() {
        super.displayPersonDetails(); // Call superclass method to display common details
        System.out.println("Specialty: " + specialty);
    }

    // Implementation of performDuties() method from Worker interface
    @Override
    public void performDuties() {
        System.out.println(name + " is preparing meals in the kitchen, specializing in " + specialty + ".");
    }
}

// Subclass: Waiter (inherits from Person and implements Worker)
class Waiter extends Person implements Worker {
    // Additional attribute for Waiter
    String section;

    // Constructor to initialize a Waiter object
    public Waiter(String name, int id, String section) {
        // Call the superclass constructor to initialize common attributes
        super(name, id);
        this.section = section;
    }

    // Method to display details specific to a Waiter
    @Override
    public void displayPersonDetails() {
        super.displayPersonDetails(); // Call superclass method to display common details
        System.out.println("Section: " + section);
    }

    // Implementation of performDuties() method from Worker interface
    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers in the " + section + " section.");
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Creating objects for different roles
        Chef chef = new Chef("Sahil Jain", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Jaspreet singh", 102, "VIP");

        // Displaying details and performing duties
        System.out.println("\nChef Details:");
        chef.displayPersonDetails();
        chef.performDuties();

        System.out.println("\nWaiter Details:");
        waiter.displayPersonDetails();
        waiter.performDuties();
    }
}

