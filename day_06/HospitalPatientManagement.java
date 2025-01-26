// Abstract Class Patient
abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    // Constructor
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract method to calculate the patient's bill
    public abstract double calculateBill();

    // Concrete method to get patient details
    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    // Getter and Setter methods for encapsulation
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// Interface MedicalRecord
interface MedicalRecord {
    void addRecord(String record);  // Method to add a medical record
    String viewRecords();  // Method to view medical records
}

// Class InPatient extends Patient and implements MedicalRecord
class InPatient extends Patient implements MedicalRecord {
    private double roomCharge;
    private String diagnosis;
    private String medicalHistory;

    // Constructor
    public InPatient(String patientId, String name, int age, double roomCharge) {
        super(patientId, name, age);
        this.roomCharge = roomCharge;
    }

    // Overriding the calculateBill method
    @Override
    public double calculateBill() {
        return roomCharge + 500;  // Additional charge for InPatient (e.g., treatment costs)
    }

    // Implementing methods from MedicalRecord interface
    @Override
    public void addRecord(String record) {
        diagnosis = record;  // Adding a diagnosis record
    }

    @Override
    public String viewRecords() {
        return "Diagnosis: " + diagnosis + "\nMedical History: " + medicalHistory;
    }

    // Getter and Setter methods for encapsulation
    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
}

// Class OutPatient extends Patient and implements MedicalRecord
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String diagnosis;

    // Constructor
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    // Overriding the calculateBill method
    @Override
    public double calculateBill() {
        return consultationFee;  // Bill for OutPatient is just the consultation fee
    }

    // Implementing methods from MedicalRecord interface
    @Override
    public void addRecord(String record) {
        diagnosis = record;  // Adding a diagnosis record
    }

    @Override
    public String viewRecords() {
        return "Diagnosis: " + diagnosis;
    }
}

// Hospital class to demonstrate polymorphism and handle patient billing
class Hospital {
    public void processPatientBill(Patient patient) {
        System.out.println(patient.getPatientDetails());
        double totalBill = patient.calculateBill();
        System.out.println("Total Bill: " + totalBill);

        // Check if the patient has medical records and view them
        if (patient instanceof MedicalRecord) {
            MedicalRecord medicalRecordPatient = (MedicalRecord) patient;
            System.out.println("Medical Records: \n" + medicalRecordPatient.viewRecords());
        }
    }
}

// Main Class
public class HospitalPatientManagement {
    public static void main(String[] args) {
        // Creating objects for InPatient and OutPatient
        InPatient inPatient = new InPatient("P1231", "John", 45, 1000);
        inPatient.addRecord("Diagnosed with pneumonia");
        inPatient.setMedicalHistory("No previous major medical history");

        OutPatient outPatient = new OutPatient("P1241", "Jane", 30, 200);
        outPatient.addRecord("Diagnosed with mild fever");

        // Creating hospital object to process bills
        Hospital hospital = new Hospital();

        // Processing InPatient bill
        System.out.println("\nProcessing InPatient Bill:");
        hospital.processPatientBill(inPatient);
        
        // Processing OutPatient bill
        System.out.println("\nProcessing OutPatient Bill:");
        hospital.processPatientBill(outPatient);
    }
}
