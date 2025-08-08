package Collectionspractice;
import java.util.Scanner;
import java.util.TreeSet;

public class TreesetEgample {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        TreeSet<String> appointments = new TreeSet<>();
	        while (true) {
	            System.out.println("1. Add Appointment");
	            System.out.println("2. View Appointment");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = sc.nextInt();
	            sc.nextLine(); 
	            if (choice == 1) {
	                System.out.print("Enter patient name: ");
	                String name = sc.nextLine();
	                System.out.print("Enter date and time: ");
	                String dateTime = sc.nextLine();
	                String newAppointment = dateTime + "  " + name;
	                boolean exists = false;
	                for (String app : appointments) {
	                    if (app.startsWith(dateTime)) {
	                        exists = true;
	                        break;
	                    }
	                }
	                if (exists) {
	                    System.out.println("Appointment already exists at that time.");
	                } else {
	                    appointments.add(newAppointment);
	                    System.out.println("Appointment added.");
	                }

	            } else if (choice == 2) {
	                if (appointments.isEmpty()) {
	                    System.out.println("No appointments found.");
	                } else {
	                    System.out.println("Appointments:");
	                    for (String app : appointments) {
	                        System.out.println(app);
	                    }
	                }

	            } else if (choice == 3) {
	                System.out.println("Exiting program.");
	                break;

	            } else {
	                System.out.println("Invalid choice.");
	            }
	        }

	        sc.close();
	    }
	}