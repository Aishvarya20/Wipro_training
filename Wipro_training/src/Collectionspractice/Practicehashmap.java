package Collectionspractice;
import java.util.HashSet;
import java.util.Scanner;

class Practicehashmap {
    private String id;
    private String name;
    private int age;

    public Practicehashmap(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void showdetails() {
        System.out.println("Patient ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }

public static void main(String[] args) {
    HashSet<Practicehashmap> patientSet = new HashSet<>();
    Scanner sc = new Scanner(System.in);

    while (true) {
        System.out.println("\n1. Register Patient");
        System.out.println("2. Show All Patients");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); 

        switch (choice) {
            case 1:
                System.out.print("Enter ID: ");
                String id = sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                sc.nextLine();

                boolean exists = false;
                for (Practicehashmap p : patientSet) {
                    if (p.getId().equals(id)) {
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    patientSet.add(new Practicehashmap(id, name, age));
                    System.out.println("Patient registered successfully.");
                } else {
                    System.out.println("Patient with this ID already exists.");
                }
                break;

            case 2:
                System.out.println("All Registered Patients:");
                if (patientSet.isEmpty()) {
                    System.out.println("No patients found.");
                } else {
                    for (Practicehashmap p : patientSet) {
                        p.showdetails();
                    }
                }
                break;

            case 3:
                System.out.println("Exiting...");
                sc.close();
                return;

            default:
                System.out.println("Invalid choice. Try again.");
        }
    }
}
}
