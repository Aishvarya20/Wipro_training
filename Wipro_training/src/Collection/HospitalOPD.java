package Collection;
import java.util.ArrayList;
import java.util.Scanner;

class Patient {
    private String name;
    private int age;
    private String disease;
    private String gender;
    private String location;

    public Patient(String name, int age, String disease , String gender ,String location) {
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.gender= gender;
        this.location = location;
        
    }

    public String getName() {
        return name;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
        System.out.println("gender: " + gender);
        System.out.println("location: " + location);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        ArrayList<Patient> patientList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        patientList.add(new Patient("Vinay Bhat", 45, "Fever", "male","hyd"));
        patientList.add(new Patient("Sonali Langar", 40, "Cough", " female","vizag"));
        patientList.add(new Patient("Renu Sai", 30, "Pain","female","kolkata"));

        while (true) {
            System.out.println("\nHospital OPD Menu:");
            System.out.println("1. Add New Patient");
            System.out.println("2. Display All Patients");
            System.out.println("3. Search Patient by Name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter patient age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter disease: ");
                    String disease = scanner.nextLine();
                    
                    System.out.print("Enter disease: ");
                    String gender = scanner.nextLine();
                    
                    System.out.print("Enter disease: ");
                    String location = scanner.nextLine();
                    

                    patientList.add(new Patient(name, age, disease,gender,location));
                    System.out.println("Patient added successfully!");
                    break;

                case 2:
                    System.out.println("All Registered Patients:");
                    for (Patient p : patientList) {
                        p.displayDetails();
                    }
                    break;

                case 3:
                    System.out.print("Enter patient name to search: ");
                    String searchName = scanner.nextLine();
                    boolean found = false;

                    for (Patient p : patientList) {
                        if (p.getName().equalsIgnoreCase(searchName)) {
                            p.displayDetails();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("No patient found with name: " + searchName);
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
