/*Sample Program 5: University Student Management
Create a Student class to manage student data with the following features:
Static:
A static variable universityName shared across all students.
A static method displayTotalStudents() to show the number of students enrolled.
This:
Use this in the constructor to initialize name, rollNumber, and grade.
Final:
Use a final variable rollNumber for each student that cannot be changed.
Instanceof:
Check if a given object is an instance of the Student class before performing operations like displaying or updating grades.
 */

// Class to represent a Student
public class Student {

    // Static final variable for the university name (shared by all students)
    final static String universityName = "RGPV";

    // Static variable to keep track of the total number of students
    private static int totalNumberOfStudent = 0;

    // Method to display the total number of students in the university
    public void displayTotalStudents() {
        System.out.println("Total number of students in the university: " + totalNumberOfStudent);
    }

    // Instance variables to store details of a student
    private String name;      // Name of the student
    private int rollNumber;   // Roll number of the student
    private char grade;       // Grade of the student

    // Constructor to initialize student details
    Student(String name, int rollNumber, char grade) {
        this.name = name;              // Assign the student's name
        this.rollNumber = rollNumber;  // Assign the student's roll number
        this.grade = grade;            // Assign the student's grade
        totalNumberOfStudent++;        // Increment the total number of students
    }

    // Method to display details of a student
    public void displayDetails() {
        // Display total number of students
        displayTotalStudents();
        // Display individual student details
        System.out.println("Student name: " + name + 
                           ", Roll number: " + rollNumber + 
                           ", Grade: " + grade);
    }
}

// Main class to demonstrate the Student class
class StudentMain {
    public static void main(String[] args) {
        // Create a new Student object with specific details
        Student sahil = new Student("Sahil Jain", 143, 'A');

        // Check if the object 'sahil' is an instance of the Student class
        if (sahil instanceof Student) {
            // Call the method to display the student's details
            sahil.displayDetails();
        }
    }
}
