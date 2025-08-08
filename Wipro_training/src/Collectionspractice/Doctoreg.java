package Collectionspractice;
import java.util.HashSet;
import java.util.Scanner;

public class Doctoreg {
    HashSet<String> doctors = new HashSet<>();
    Scanner scanner = new Scanner(System.in);

    public void startSystem() {
        while (true) {
            System.out.println("1. Adding Doctor");
            System.out.println("2. Show All Doctors");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addDoctor();
                    break;
                case 2:
                    showDoctors();
                    break;
                case 3:
                    System.out.println("exit");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    public void addDoctor() {
        System.out.print("Enter doctor name: ");
        String name = scanner.nextLine();

        if (doctors.add(name)) {
            System.out.println("Doctor '" + name + "' added successfully");
        } else {
            System.out.println(" Doctor '" + name + "' is already registered.");
        }
    }

    public void showDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors registered yet.");
        } else {
            System.out.println("Registered Doctors:");
            int count = 1;
            for (String doctor : doctors) {
                System.out.println(count + ". " + doctor);
                count++;
            }
            System.out.println("Total doctors: " + doctors.size());
        }
    }

    public static void main(String[] args) {
        Doctoreg system = new Doctoreg(); 
        system.startSystem();            
    }
}
