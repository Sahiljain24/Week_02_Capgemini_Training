package self_problems;

import java.util.ArrayList;

// create a class School with a field name of type String
class School {
    private String name;
    ArrayList<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    // create a method addStudent which takes a Student object as an argument and
    // adds it to the list of students
    public void addStudent(Student s) {
        this.students.add(s);
    }

    // create a method removeStudent which takes a Student object as an argument and
    // removes it from the list of students
    public void removeStudent(Student s) {
        this.students.remove(s);
    }

    // create a method displayAll which takes a Course object as an argument and
    // displays the name of the school, the list of students, and the course details
    public void displayAll(Course c) {
        System.out.println("School Name: " + this.name);
        System.out.println("Students: " + this.students);
        c.displayCourseWithStudents();
    }

}

class Student {
    private String name;
    private String rollNumber;
    ArrayList<Course> courses;

    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course c) {
        this.courses.add(c);
    }

    public void removeCourse(Course c) {
        this.courses.remove(c);
    }

    public String getName(int name) {

        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return this.rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    // create a method displayStudents which displays the name, roll number, and
    // courses of the student
    public void displayStudents() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Roll Number: " + this.rollNumber);
        System.out.println("Student Courses: ");
        for (Course c : courses) {
            System.out.println(c.getCourseName());
        }
    }
}

class Course {
    private String courseName;
    private ArrayList<Student> students;

    Course(String CourseName) {
        this.courseName = CourseName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        this.students.add(s);
    }

    public void removeStudent(Student s) {
        this.students.remove(s);
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public void setCourses(ArrayList<Student> students) {
        this.students = students;
    }

    // create a method displayCourseWithStudents which displays the course name and
    // the list of students enrolled in the course
    public void displayCourseWithStudents() {
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Students in this course: ");
        for (Student s : students) {
            s.displayStudents();
        }
    }
}

public class MainSchool {
    public static void main(String[] args) {
        School sc1 = new School("Excellence School");
        Student st1 = new Student("Neeraj", "AL203");
        Student st2 = new Student("Lokendra", "AL204");
        Student st3 = new Student("Rahul", "AL205");
        Course c1 = new Course("Java");
        Course c2 = new Course("Python");
        c1.addStudent(st1);
        c1.addStudent(st2);
        st1.addCourse(c1);
        st2.addCourse(c1);
        c2.addStudent(st2);
        c2.addStudent(st3);
        st2.addCourse(c2);
        sc1.addStudent(st1);
        sc1.addStudent(st2);
        sc1.addStudent(st3);
        sc1.displayAll(c1);
    }
}
