package com.healthcare.module;

public class Cardio extends Doctor {
    public Cardio(String name) {
        super(name, "Cardiology");
    }

    public void diagnose(Regpatient patient) {
        System.out.println("Dr. " + getName() + " (" + getSpecialization() + ") is diagnosing patient: " + patient.Patientname());
    }
}
