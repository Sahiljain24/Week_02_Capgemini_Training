/*Question 1
Program to Simulate Student Report
Problem Statement: Create a Student class with attributes name, rollNumber, and marks. Add two methods:
To calculate the grade based on the marks.
To display the student's details and grade.
 */
// Class to represent a Student
public class Student {
    
    // Private attributes to store student details
    private String name;       // Name of the student
    private int rollNumber;    // Roll number of the student
    private double marks;      // Marks scored by the student

    // Constructor to initialize the attributes of the Student
    Student(String name, int rollNumber, double marks) {
        this.name = name;             // Assign name
        this.rollNumber = rollNumber; // Assign roll number
        this.marks = marks;           // Assign marks
    }

    // Method to calculate and return the grade based on marks
    public char grade() {
        char grade;

        // Determine the grade based on marks
        if (marks > 90) {
            grade = 'A';
        } else if (marks > 70) {
            grade = 'B';  
        } else if (marks > 60) {
            grade = 'C';  
        } else {
            grade = 'F';
        }
        return grade;
    }

    // Method to display the student details
    public void studentDetails() {
        char grade = grade(); // Call the grade method to get the grade
        System.out.printf(
            "Student name is %s, his roll number is %d,\n" +
            "the marks scored by him is %.2f, and the grade obtained is %c\n", 
            name, rollNumber, marks, grade
        );
    }
}

// Main class to test the Student class
class StudentMain {
    public static void main(String[] args) {
        // Create a Student object with specific details
        Student student = new Student("Sahil Jain", 143, 99);

        // Display the details of the student
        student.studentDetails();
    }
}
