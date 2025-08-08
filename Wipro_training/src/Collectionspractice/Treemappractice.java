package Collectionspractice;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Treemappractice {
    private String doctorname;
    private String patientname;
    private int age;
    private int id;
    private String time;

    public Treemappractice(String doctorname, String patientname, int age, int id, String time) {
        this.doctorname = doctorname;
        this.patientname = patientname;
        this.age = age;
        this.id = id;
        this.time = time;
    }

    public String toString() {
        return " Doctor: " + doctorname + ", Patient: " + patientname +
               ", Age: " + age + ", ID: " + id + ", Time: " + time;
    }

    public static void main(String[] args) {
        TreeMap<String, Treemappractice> patientsdata = new TreeMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. add appointment");
            System.out.println("2. view appointments");
            System.out.println("3. remove appointment");
            System.out.println("4. reschedule appointment");
            System.out.println("5. first appointment");
            System.out.println("6. last appointment");
            System.out.println("7. exit");
            System.out.print("enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                System.out.print("enter time: ");
                String time = sc.nextLine();
                System.out.print("enter doctor name: ");
                String doctor = sc.nextLine();
                System.out.print("enter patient name: ");
                String patient = sc.nextLine();
                System.out.print("enter age: ");
                int age = sc.nextInt();
                System.out.print("enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                Treemappractice a = new Treemappractice(doctor, patient, age, id, time);
                patientsdata.put(time, a);
                System.out.println("appointment booked.");

            } else if (choice == 2) {
                if (patientsdata.isEmpty()) {
                    System.out.println("no appointments .");
                } else {
                    System.out.println("all  booked appointments:");
                    for (Entry<String, Treemappractice> entry : patientsdata.entrySet()) {
                        System.out.println("Time: " + entry.getKey() + entry.getValue());
                    }
                }

            } else if (choice == 3) {
                System.out.print("enter time to remove appointment: ");
                String time = sc.nextLine();

                if (patientsdata.containsKey(time)) {
                    patientsdata.remove(time);
                    System.out.println("appointment removed.");
                } else {
                    System.out.println("no appointment ");
                }
            } else if (choice == 5) {
                if (patientsdata.isEmpty()) {
                    System.out.println("no appointments found.");
                } else {
                    Map.Entry<String, Treemappractice> first = patientsdata.firstEntry();
                    System.out.println("first Appointment booked Time: " + first.getKey() + first.getValue());
                }

            } else if (choice == 6) {
                if (patientsdata.isEmpty()) {
                    System.out.println("No appointments found.");
                } else {
                    Map.Entry<String, Treemappractice> last = patientsdata.lastEntry();
                    System.out.println("Last Appointment booked  Time: " + last.getKey() + last.getValue());
                }

            } else if (choice == 7) {
                System.out.println("Exit");
                break;

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
