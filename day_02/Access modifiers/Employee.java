// Employee class
public class Employee {
    // Public field: employee ID (can be accessed directly)
    public String employeeID;
    
    // Protected field: department (can be accessed within the class and its subclasses)
    protected String department;
    
    // Private field: salary (can only be accessed within the Employee class)
    private double salary;

    // Constructor to initialize employee details
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID; // Initialize employee ID
        this.department = department; // Initialize department
        this.salary = salary; // Initialize salary
    }

    // Public method to modify salary
    public void modifySalary(double newSalary) {
        if (newSalary >= 0) { // Ensure the salary is non-negative
            this.salary = newSalary; // Set the new salary
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    // Public method to get the salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details (excluding salary since it's private)
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary()); // Access private salary via getter
    }
}

// Manager subclass that inherits from Employee
  class Manager extends Employee {
    // Constructor for Manager class
    public Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary); // Call superclass constructor to initialize fields
    }

    // Method to display manager details (Manager can access employeeID and department)
    public void displayManagerDetails() {
        // Access employeeID (public) and department (protected) from superclass
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Manager Department: " + department);
        System.out.println("Manager Salary: " + getSalary()); // Access private salary via getter
    }
}

// Main method to test the Employee and Manager classes
 class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("E123", "Engineering", 50000.00);
        System.out.println("Employee Details:");
        employee.displayEmployeeDetails();

        // Modify employee's salary
        employee.modifySalary(55000.00);
        System.out.println("\nUpdated Employee Details:");
        employee.displayEmployeeDetails();

        // Create a Manager object (Manager is a subclass of Employee)
        Manager manager = new Manager("M101", "Engineering", 75000.00);
        System.out.println("\nManager Details:");
        manager.displayManagerDetails();
    }
}
