package day_05.MultilevelInheritance;
/*
Sample Problem 2: Educational Course Hierarchy
Description: Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
Tasks:
Define a superclass Course with attributes like courseName and duration.
Define OnlineCourse to add attributes such as platform and isRecorded.
Define PaidOnlineCourse to add fee and discount.
Goal: Demonstrate how each level of inheritance builds on the previous, adding complexity to the system.
 */

// Base class: Course
class Course {
    // Common attributes of a course
    String courseName;
    int duration; // duration in hours

    // Constructor to initialize the Course object
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display basic course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

// Subclass: OnlineCourse (inherits from Course)
class OnlineCourse extends Course {
    // Additional attributes for online courses
    String platform;  // platform where the course is hosted (e.g., Zoom, Udemy)
    boolean isRecorded; // whether the course is recorded or live

    // Constructor to initialize the OnlineCourse object
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        // Call the superclass constructor to initialize common course attributes
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Method to display online course details, including platform and recording status
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails(); // Call the superclass method to display basic course details
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass: PaidOnlineCourse (inherits from OnlineCourse)
class PaidOnlineCourse extends OnlineCourse {
    // Additional attributes for paid online courses
    double fee; // course fee
    double discount; // discount on the course fee

    // Constructor to initialize the PaidOnlineCourse object
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        // Call the superclass constructor to initialize common and online course attributes
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Method to display paid online course details, including fee and discount
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails(); // Call the superclass method to display online course details
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
    }
}

public class CourseManagementSystem {
    public static void main(String[] args) {
        // Creating a PaidOnlineCourse object with course details
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Java Programming", 40, "studyNotion", true, 199.99, 20);

        // Displaying the course details for the paid online course
        paidCourse.displayCourseDetails();
    }
}
