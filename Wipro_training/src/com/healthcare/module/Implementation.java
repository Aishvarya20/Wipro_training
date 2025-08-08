package com.healthcare.module;

public class Implementation implements Service {
    
	private Regpatient currentPatient;

    public void Patientregistration(Regpatient patient) {
        this.currentPatient = patient;
        System.out.println("Patient registered successfully.");
    }

    public void DisplaypatientDetails(int id) {
        if (currentPatient != null) {
            System.out.println("Patient ID: " + currentPatient.PatientID());
            System.out.println("Patient Name: " + currentPatient.Patientname());
            System.out.println("Patient Age: " + currentPatient.PatientAge());
            System.out.println("Patient Illness: " + currentPatient.PatientIllness());
        } else {
            System.out.println("Patient not found.");
        }
    }
}

