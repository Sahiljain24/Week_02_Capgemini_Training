/*Sample Program 7: Hospital Management System
Create a Patient class with the following features:
Static:
A static variable hospitalName shared among all patients.
A static method getTotalPatients() to count the total patients admitted.
This:
Use this to initialize name, age, and ailment in the constructor.
Final:
Use a final variable patientID to uniquely identify each patient.
Instanceof:
Check if an object is an instance of the Patient class before displaying its details.
 */

// Class to represent a Patient in the Hospital Management System
public class Patient {

    // Static final variable for the hospital name (shared among all patients)
    static final String hospitalName = "Sahil Hospital";

    // Static variable to keep track of the total number of patients
    private static int totalNumberOfPatient = 0;

    // Static method to display the total number of patients admitted
    static void getTotalPatients() {
        System.out.println("Total number of patients in the hospital: " + totalNumberOfPatient);
    }

    // Instance variables for patient details
    private String name;       // Name of the patient
    private int age;           // Age of the patient
    private String ailment;    // Ailment the patient is suffering from
    private final String patientID; // Unique patient ID (final)

    // Constructor to initialize patient details
    Patient(String name, String ailment, int age) {
        this.name = name;             // Assign the patient's name
        this.age = age;               // Assign the patient's age
        this.ailment = ailment;       // Assign the patient's ailment
        this.patientID = "PAT" + (++totalNumberOfPatient); // Generate a unique patient ID
    }

    // Method to display patient details
    public void displayDetails() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Hospital Name: " + hospitalName);
    }
}

// Main class to demonstrate the Patient class
class PatientMain {
    public static void main(String[] args) {
        // Create a new Patient object
        Patient patient1 = new Patient("Sahil Jain", "Fever", 25);

        // Check if the object 'patient1' is an instance of the Patient class
        if (patient1 instanceof Patient) {
            System.out.println("Patient Details:");
            patient1.displayDetails();
        }

        // Display the total number of patients admitted
        Patient.getTotalPatients();

        // Create another Patient object
        Patient patient2 = new Patient("Amit Sharma", "Cold", 30);

        // Check if the object 'patient2' is an instance of the Patient class
        if (patient2 instanceof Patient) {
            System.out.println("\nPatient Details:");
            patient2.displayDetails();
        }

        // Display the updated total number of patients admitted
        Patient.getTotalPatients();
    }
}
