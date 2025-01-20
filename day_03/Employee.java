/*Sample Program 3: Employee Management System
Design an Employee class with the following features:
Static:
A static variable companyName shared by all employees.
A static method displayTotalEmployees() to show the total number of employees.
This:
Use this to initialize name, id, and designation in the constructor.
Final:
Use a final variable id for the employee ID, which cannot be modified after assignment.
Instanceof:
Check if a given object is an instance of the Employee class before printing the employee details.
 */
// Class representing an Employee
public class Employee {
    // Static variable to store the company name
    static String companyName = "Jain Corporation";

    // Static variable to keep track of the total number of employees
    static int totalEmployees = 0;

    // Static method to display the total employees in the company
    static void displayTotalEmployees() {
        System.out.println("Company name = " + companyName);
    }

    // Instance variables to store employee details
    private String name; // Name of the employee
    private String designation; // Designation of the employee
    final private int id; // Unique identifier (ID) for the employee

    // Constructor to initialize employee details
    Employee(String name, String designation, int id) {
        this.name = name; // Assign the name
        this.designation = designation; // Assign the designation
        this.id = id; // Assign the ID
        totalEmployees++; // Increment total employees count
    }

    // Method to display the details of the employee
    public void displayDetails() {
        // Display employee details
        System.out.println("Employee name = " + name + 
                           ", Designation = " + designation + 
                           ", ID = " + id);
        // Display company name
        displayTotalEmployees();
    }
}

// Main class to demonstrate the Employee class
class EmployeeMain {
    public static void main(String[] args) {
        // Create a new Employee object with specified details
        Employee first = new Employee("Sahil Jain", "HR", 457896);

        // Check if the object 'first' is an instance of the Employee class
        if (first instanceof Employee) {
            // Call the method to display the employee details
            first.displayDetails();
        }
    }
}
