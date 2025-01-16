/*Program to Compute Area of a Circle
Problem Statement: Write a program to create a Circle class with an attribute radius. Add methods to calculate and display the area and circumference of the circle.
 */
import java.util.Scanner;

// Class to represent a Circle
public class Circle {
     
    // Private variable to store the radius of the circle
    private double radius;

    // Constructor to initialize the radius of the circle
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double Area() {
        // Area formula: π * radius^2
        double area = 3.14 * radius * radius;
        return area;
    }

    // Method to calculate the circumference of the circle
    public double circumference() {
        // Circumference formula: 2 * π * radius
        double circumference = 2 * 3.14 * radius;
        return circumference;
    }

    // Method to display the area of the circle
    public void diplayArea() {
        // Calculate the area and display it with 2 decimal precision
        double area = Area();
        System.out.printf("The area of this circle is = %.2f\n", area);
    }

    // Method to display the circumference of the circle
    public void diplayCircumference() {
        // Calculate the circumference and display it with 2 decimal precision
        double circumference = circumference();
        System.out.printf("The Circumference of this circle is = %.2f\n", circumference);
    }
}

// Main class to demonstrate the functionality of the Circle class
class CircleMain {
    public static void main(String[] args) {
        // Create a Circle object with a radius of 5
        Circle circle = new Circle(5);

        // Display the area of the circle
        circle.diplayArea();

        // Display the circumference of the circle
        circle.diplayCircumference();
    }
}
