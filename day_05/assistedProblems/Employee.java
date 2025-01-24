package day_05.assistedProblems;
/*Employee Management System
Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
Tasks:
Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager and programmingLanguage for Developer.
Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.
 */

 
// Base Class: Employee
public class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {
    int teamSize;

    // Constructor
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary); // Call the superclass constructor
        this.teamSize = teamSize;
    }

    // Overriding displayDetails() method
    @Override
    void displayDetails() {
        super.displayDetails(); // Call the base method
        System.out.println("Team Size: " + teamSize);
    }
}

// Subclass: Developer
class Developer extends Employee {
    String programmingLanguage;

    // Constructor
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary); // Call the superclass constructor
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding displayDetails() method
    @Override
    void displayDetails() {
        super.displayDetails(); // Call the base method
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Subclass: Intern
class Intern extends Employee {
    int duration; // Duration in months

    // Constructor
    public Intern(String name, int id, double salary, int duration) {
        super(name, id, salary); // Call the superclass constructor
        this.duration = duration;
    }

    // Overriding displayDetails() method
    @Override
    void displayDetails() {
        super.displayDetails(); // Call the base method
        System.out.println("Internship Duration: " + duration + " months");
    }
}

// Main Class
 class EmployeeMain {
    public static void main(String[] args) {
        // Creating objects for different employee types
        Employee manager = new Manager("Sahil Jain", 101, 40000, 10);
        Employee developer = new Developer("Adarsh Biswas", 102, 15000, "Java");
        Employee intern = new Intern("Arnav Pandey", 103, 2000, 6);

        // Displaying details for each employee
        manager.displayDetails();
        System.out.println( );
        developer.displayDetails();
        System.out.println( );
        intern.displayDetails();
    }
}
