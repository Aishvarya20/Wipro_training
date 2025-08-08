package Collectionspractice;
import java.util.HashSet;
import java.util.Scanner;

public class Hashsetpractice {

    public static void main(String[] args) {
        HashSet<String> patientIDs = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Patient Reg");
            System.out.println("2. View All Reg patients");
            System.out.println("3. View if already Patient exist");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID to Register: ");
                    String id = sc.nextLine();

                    if (patientIDs.add(id)) {
                        System.out.println(" Patient registered with ID: " + id);
                    } else {
                        System.out.println(" Patient already registered.");
                    }
                    break;

                case 2:
                    System.out.println(" Registered Patient IDs:");
                    if (patientIDs.isEmpty()) {
                        System.out.println("No patients registered .");
                    } else {
                        for (String pid : patientIDs) {
                            System.out.println(" " + pid);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Patient ID to Check: ");
                    String searchId = sc.nextLine();
                    if (patientIDs.contains(searchId)) {
                        System.out.println(" Patient with ID '" + searchId + "' exists.");
                    } else {
                        System.out.println(" Patient with ID '" + searchId + "' not found.");
                    }
                    break;

                case 4:
                    System.out.println("exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
