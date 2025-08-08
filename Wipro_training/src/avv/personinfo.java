package avv;
import java.util.Scanner;


public class personinfo {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("1. Teacher");
	        System.out.println("2. Student");
	        System.out.print("Choose a person type (1 or 2): ");
	        int choice = sc.nextInt();

	        if (choice == 1) {
	        	Teacher t = new Teacher();
	            t.role();
	        } else if (choice == 2) {
	        	 Student s = new Student();
	             s.learn();  
	        } else {
	            System.out.println("Invalid choice.");
	        }

	        sc.close();
	    }
	}

	