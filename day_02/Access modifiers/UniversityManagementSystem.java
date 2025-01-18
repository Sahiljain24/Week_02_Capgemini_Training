public class UniversityManagementSystem {
    // Nested Student class to represent undergraduate students
    public static class Student {
        // Public, protected, and private attributes for Student
        public int rollNumber;  // Public: Accessible everywhere
        protected String name;  // Protected: Accessible within package and subclasses
        private double CGPA;    // Private: Accessible only within this class

        // Constructor to initialize student details
        public Student(int rollNumber, String name, double CGPA) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.CGPA = CGPA;
        }

        // Public getter for CGPA
        public double getCGPA() {
            return CGPA;
        }

        // Public setter for CGPA with validation
        public void setCGPA(double CGPA) {
            if (CGPA >= 0.0 && CGPA <= 10.0) {
                this.CGPA = CGPA; // Update CGPA if valid
            } else {
                System.out.println("Invalid CGPA. It should be between 0.0 and 10.0.");
            }
        }

        // Method to display student details
        public void displayStudentDetails() {
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("CGPA: " + CGPA);
        }
    }

    // Nested PostgraduateStudent class, extending Student
    public static class PostgraduateStudent extends Student {
        private String thesisTitle;  // Attribute specific to postgraduate students

        // Constructor to initialize postgraduate student details
        public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTitle) {
            super(rollNumber, name, CGPA);  // Call the superclass constructor
            this.thesisTitle = thesisTitle;
        }

        // Method to display postgraduate student details
        public void displayPostgraduateStudentDetails() {
            displayStudentDetails();  // Call superclass method to display common details
            System.out.println("Thesis Title: " + thesisTitle);
        }
    }

    public static void main(String[] args) {
        // Creating an undergraduate Student object
        Student student1 = new Student(101, "Alice", 9.2);
        System.out.println("Undergraduate Student Details:");
        student1.displayStudentDetails();

        // Modifying CGPA using public setter method
        student1.setCGPA(8.5);
        System.out.println("\nUpdated CGPA for Alice: " + student1.getCGPA());

        // Creating a PostgraduateStudent object
        PostgraduateStudent pgStudent1 = new PostgraduateStudent(102, "Bob", 8.7, "Machine Learning in Healthcare");
        System.out.println("\nPostgraduate Student Details:");
        pgStudent1.displayPostgraduateStudentDetails();
    }
}
