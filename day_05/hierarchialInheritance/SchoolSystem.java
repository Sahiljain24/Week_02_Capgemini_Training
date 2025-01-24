package day_05.hierarchialInheritance;
/*Sample Problem 2: School System with Different Roles
Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
Tasks:
Define a superclass Person with common attributes like name and age.
Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
Each subclass should have a method like displayRole() that describes the role.
Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics. */
// Base class: Person
class Person {
    // Common attributes for all persons
    String name;
    int age;

    // Constructor to initialize a Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display common person details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to display the role (to be overridden in subclasses)
    public void displayRole() {
        System.out.println("Role: General Person");
    }
}

// Subclass: Teacher (inherits from Person)
class Teacher extends Person {
    // Additional attribute for Teacher
    String subject;

    // Constructor to initialize a Teacher object
    public Teacher(String name, int age, String subject) {
        // Call the superclass constructor to initialize common attributes
        super(name, age);
        this.subject = subject;
    }

    // Method to display details specific to a Teacher
    @Override
    public void displayPersonDetails() {
        super.displayPersonDetails(); // Call superclass method to display common details
        System.out.println("Subject: " + subject);
    }

    // Override displayRole to specify the role as Teacher
    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
    }
}

// Subclass: Student (inherits from Person)
class Student extends Person {
    // Additional attribute for Student
    String grade;

    // Constructor to initialize a Student object
    public Student(String name, int age, String grade) {
        // Call the superclass constructor to initialize common attributes
        super(name, age);
        this.grade = grade;
    }

    // Method to display details specific to a Student
    @Override
    public void displayPersonDetails() {
        super.displayPersonDetails(); // Call superclass method to display common details
        System.out.println("Grade: " + grade);
    }

    // Override displayRole to specify the role as Student
    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }
}

// Subclass: Staff (inherits from Person)
class Staff extends Person {
    // Additional attribute for Staff
    String position;

    // Constructor to initialize a Staff object
    public Staff(String name, int age, String position) {
        // Call the superclass constructor to initialize common attributes
        super(name, age);
        this.position = position;
    }

    // Method to display details specific to a Staff member
    @Override
    public void displayPersonDetails() {
        super.displayPersonDetails(); // Call superclass method to display common details
        System.out.println("Position: " + position);
    }

    // Override displayRole to specify the role as Staff
    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        // Creating objects for different roles
        Teacher teacher = new Teacher("Sahil Jain", 21, "Mathematics");
        Student student = new Student("Deepika nagraj", 16, "10th Grade");
        Staff staff = new Staff("Jaspreet singht", 22, "Administrator");

        // Displaying details for each role
        System.out.println("\nTeacher Details:");
        teacher.displayRole();
        teacher.displayPersonDetails();

        System.out.println("\nStudent Details:");
        student.displayRole();
        student.displayPersonDetails();

        System.out.println("\nStaff Details:");
        staff.displayRole();
        staff.displayPersonDetails();
    }
}
