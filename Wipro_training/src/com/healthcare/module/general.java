package com.healthcare.module;

public class general extends Doctor {

    public general(String name) {
        super(name, "General Medicine");
    }

    public void diagnose(Regpatient patient) {
        System.out.println("Dr. " + getName() + " (" + getSpecialization() + ") is diagnosing patient: " + patient.Patientname());
    }
}
