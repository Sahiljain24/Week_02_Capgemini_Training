/*Question 1: Program to Display Employee Details
Problem Statement: Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details.
 */

 //create a class Employee
 public class Employee {
    
    //create attribute of Employee class
    private String name;
    private int id;
    private double salary;

    //create a constructor to initialize the attribute feilds
    Employee(String name , int id ,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    //create the method to diplay the details of the employee
    public void displayDetails(){
        System.out.println("The Details of the employee is %n" + "name = " +name + " id = " + id + " Salary = " + salary );
    }
 }
  //create a class main
  class EmployeeMain{
    public static void main(String[] args) {
        //create objects of employee class using new keyword and also give parameters in the constructor
        Employee employee1 = new Employee("Sahil Jain", 143, 40000);
        Employee employee2 = new Employee("Adarsh Biswas", 39, 30000);
        Employee employee3= new Employee("Arnav Panday", 18, 40000);
        
        //call the displayDetails method to Display the details of the employee
        employee1.displayDetails();
        employee2.displayDetails();
        employee3.displayDetails();

    }
  }