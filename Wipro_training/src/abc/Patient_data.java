package abc;
import java.util.Scanner;

public class Patient_data {

	public static void main(String[] args) {
		        Patient p = new Patient();

	        p.setName("abc");
	        p.setAge(5);
		        p.setHealthIssue("cold");

	        System.out.println("Patient Record:");
		        System.out.println("Name: " + p.getName());
		        System.out.println("Age: " + p.getAge());
		        System.out.println(" Issue: " + p.getHealthIssue());
		    }


	}
