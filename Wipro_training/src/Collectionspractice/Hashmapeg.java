package Collectionspractice;
import java.util.HashMap;
import java.util.Scanner;
public class Hashmapeg {
    private String name;
    private int age;
    private String disease;

    public Hashmapeg(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setDisease(String disease) {
        this.disease = disease;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    public String toString() {
        return ("\nName: " + name +"\nAge: " + age + "\nDisease: " + disease);
    }

    public static void main(String[] args) {
        HashMap<String, Hashmapeg> patientData = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Patient");
            System.out.println("2. All Patients");
            System.out.println("3. Update Patient");
            System.out.println("4. Remove Patient");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter Patient ID: ");
                String id = sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Disease: ");
                String disease = sc.nextLine();
                patientData.put(id, new Hashmapeg(name, age, disease));
                System.out.println("Patient added.");
            } else if (choice == 2) {
                System.out.println("All Patient Records:");
                for (String id : patientData.keySet()) {
                    System.out.println("ID:" + id + patientData.get(id));
                }
            } else if (choice == 3) {
                System.out.print("Enter Patient ID to update: ");
                String id = sc.nextLine();
                if (patientData.containsKey(id)) {
                    System.out.print("Enter New Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter New Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Disease: ");
                    String disease = sc.nextLine();
                    patientData.put(id, new Hashmapeg(name, age, disease));
                    System.out.println("Patient updated.");
                } else {
                    System.out.println("Patient not found.");
                }
            } else if (choice == 4) {
                System.out.print("Enter Patient ID to remove: ");
                String id = sc.nextLine();
                if (patientData.remove(id) != null) {
                    System.out.println("Patient removed.");
                } else {
                    System.out.println("Patient ID not found.");
                } 
            } else if (choice == 5) {
                System.out.println("exit");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
