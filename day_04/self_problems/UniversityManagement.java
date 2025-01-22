package self_problems;

import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private String courseCode;
    private List<Student> enrolledStudents;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.enrolledStudents = new ArrayList<>();
    }

    // Method to add a student to the course
    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}

class Professor {
    private String name;
    private String id;
    private List<Course> coursesTaught;

    // Constructor
    public Professor(String name, String id) {
        this.name = name;
        this.id = id;
        this.coursesTaught = new ArrayList<>();
    }

    // Method to assign a course to the professor
    public void assignCourse(Course course) {
        coursesTaught.add(course);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }
}

class Student {
    private String name;
    private String id;
    private List<Course> enrolledCourses;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }
}

public class UniversityManagement {
    public static void main(String[] args) {

        Course javaCourse = new Course("Java Programming", "CS101");
        Course dbCourse = new Course("Database Systems", "CS102");
        Professor profSmith = new Professor("Prof. Smith", "P001");
        Professor profJohnson = new Professor("Prof. Johnson", "P002");
        profSmith.assignCourse(javaCourse);
        profJohnson.assignCourse(dbCourse);

        Student studentAlice = new Student("Alice", "S001");
        Student studentBob = new Student("Bob", "S002");

        studentAlice.enrollCourse(javaCourse);
        studentAlice.enrollCourse(dbCourse);
        studentBob.enrollCourse(javaCourse);

        System.out.println("Course: " + javaCourse.getCourseName());
        for (Student student : javaCourse.getEnrolledStudents()) {
            System.out.println(student.getName() + " (" + student.getId() + ")");
        }

        System.out.println("\nCourse: " + dbCourse.getCourseName());
        for (Student student : dbCourse.getEnrolledStudents()) {
            System.out.println(student.getName() + " (" + student.getId() + ")");
        }

        System.out.println("\nProfessor: " + profSmith.getName());
        for (Course course : profSmith.getCoursesTaught()) {
            System.out.println(course.getCourseName() + " (" + course.getCourseCode() + ")");
        }

        System.out.println("\nProfessor: " + profJohnson.getName());
        for (Course course : profJohnson.getCoursesTaught()) {
            System.out.println(course.getCourseName() + " (" + course.getCourseCode() + ")");
        }
    }
}