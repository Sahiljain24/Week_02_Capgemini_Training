package self_problems;

import java.util.ArrayList;
import java.util.List;

// create a class Doctor with a field name of type String
class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void talkTo(Patient p) {
        System.out.println(name + " is talking to " + p.name);
    }
}

// create a class Patient with a field name of type String
class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }

    // create a method talkTo which takes a Doctor object as an argument and prints
    // the name of the patient and the doctor
    void talkTo(Doctor d) {
        System.out.println(name + " is talking to " + d.name);
    }
}

// create a class Hospital with fields doctors and patients of type List<Doctor>
// and List<Patient> respectively
class Hospital {
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();

    // create a method addDoctor which takes a Doctor object as an argument and adds
    // it to the list of doctors
    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    // create a method addPatient which takes a Patient object as an argument and
    // adds it to the list of patients
    void addPatient(Patient p) {
        patients.add(p);
    }

    void startTalk() {
        for (Doctor d : doctors) {
            for (Patient p : patients) {
                d.talkTo(p);
                p.talkTo(d);
            }
        }
    }
}

public class MainHospital {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Doctor doctor1 = new Doctor("Dr. Doc1");
        Doctor doctor2 = new Doctor("Dr. Doc2");

        Patient patient1 = new Patient("Patient1");
        Patient patient2 = new Patient("Patient2");

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        hospital.startTalk();
    }
}
