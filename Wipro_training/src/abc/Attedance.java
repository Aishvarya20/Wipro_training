package abc;
import java.util.Scanner;

public class Attedance {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);


	        System.out.print("Enter number of students: ");
	        int n = sc.nextInt();
	        sc.nextLine(); 
	        String[] names = new String[n];
	        String[] status = new String[n];


	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter name of student " + (i + 1) + ": ");
	            names[i] = sc.nextLine();
	        }


	        for (int i = 0; i < n; i++) {
	            System.out.print("Is " + names[i] + " present or absent? ");
	            status[i] = sc.nextLine();
	        }


	        System.out.println("\nAttendance Report:");
	        for (int i = 0; i < n; i++) {
	            System.out.println(names[i] + " - " + status[i]);
	        }

	        sc.close();
	    }
	}
