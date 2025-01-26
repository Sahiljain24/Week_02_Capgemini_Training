// Abstract class Employee
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}

// Interface Department
interface Department {
    void assignDepartment(String departmentName);

    String getDepartmentDetails();
}

// Subclass FullTimeEmployee
class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double fixedSalary;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + fixedSalary;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Subclass PartTimeEmployee
class PartTimeEmployee extends Employee implements Department {
    private String department;
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, double hourlyRate, int hoursWorked) {
        super(employeeId, name, baseSalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hourlyRate * hoursWorked);
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Main class to demonstrate the system
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create a list of employees
        Employee[] employees = new Employee[2];

        // Create FullTimeEmployee and PartTimeEmployee objects
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(1, "Alice", 50000, 20000);
        fullTimeEmployee.assignDepartment("Engineering");

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2, "Bob", 20000, 500, 40);
        partTimeEmployee.assignDepartment("Support");

        // Add employees to the array
        employees[0] = fullTimeEmployee;
        employees[1] = partTimeEmployee;

        // Process and display details for each employee
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("Calculated Salary: " + employee.calculateSalary());

            if (employee instanceof Department) {
                System.out.println(((Department) employee).getDepartmentDetails());
            }
            System.out.println("----------------------------------");
        }
    }
}
