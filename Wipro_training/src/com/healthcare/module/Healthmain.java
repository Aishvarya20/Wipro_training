package com.healthcare.module;

import java.util.Scanner;

public class Healthmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Regpatient patient = new Regpatient();

        System.out.print("Enter Patient Name: ");
        patient.setName(sc.nextLine());

        System.out.print("Enter Patient Age: ");
        patient.setAge(sc.nextInt());

        System.out.print("Enter Patient ID: ");
        patient.setId(sc.nextInt());
        sc.nextLine(); 

        System.out.print("Enter Illness: ");
        patient.setIllness(sc.nextLine());

        Service service = new Implementation();
        service.Patientregistration(patient);

        sc.nextLine(); 
        System.out.println("\nChoose Doctor Type:");
        System.out.println("1. Cardiologist");
        System.out.println("2. General Physician");
        System.out.print("Enter choice (1 or 2): ");
        int doctorChoice = sc.nextInt();

        Doctor doctor;

        if (doctorChoice == 1) {
            doctor = new Cardio("Dr. Rahul");
        } else {
            doctor = new general("Dr. Priya");
        }

        doctor.diagnose(patient);

        sc.close();
    }
}
