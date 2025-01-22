package assisted_problems;

import java.util.ArrayList;

class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    public void removeDepartment(Department department) {
        this.departments.remove(department);
    }

    public void displayAll(Department d) {
        System.out.println("Company Name: " + this.name);
        d.displayAll();

    }
}

class Department {
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.employees = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addEmployee(Employee e) {
        this.employees.add(e);
    }

    public void removeEmployee(Employee e) {
        this.employees.remove(e);
    }

    public void displayAll() {
        System.out.println("Department Name: " + this.name);
        // e.displayAll();
        for (Employee e : employees) {
            e.displayAll();
        }

    }
}

class Employee {
    private String name;
    final String id;
    private long salary;

    Employee(String name, String id, long salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public long getSalary() {
        return salary;
    }

    public void displayAll() {
        System.out.println("Name: " + name + " ID: " + id + " Salary " + salary);
    }
}

public class CompanyMain {
    public static void main(String[] args) {
        Employee e = new Employee("Adarsh", "127Al321", 120000);
        Department d = new Department("TempLab");
        d.addEmployee(e);
        e.displayAll();
        Company c = new Company("Capgemini");
        c.addDepartment(d);
        c.displayAll(d);

    }

}
