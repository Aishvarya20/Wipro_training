package abc;
import java.util.Scanner;

public class atm_tracker {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of parts: ");
	        int n = sc.nextInt();

	        int[][] atm = new int[n][2];  

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter parts (like  2000,500,100): ");
	            atm[i][0] = sc.nextInt();

	            System.out.print("Enter number of notes " + atm[i][0] + ": ");
	            atm[i][1] = sc.nextInt();
	        }

	        int total = 0;
	        System.out.println("ATM Cash ");
	        for (int i = 0; i < n; i++) {
	            int denom = atm[i][0];
	            int count = atm[i][1];
	            int amount = denom * count;

	            System.out.println( "₹" + denom + " x " + count + " = ₹" + amount);
	            total += amount;
	        }

	        System.out.println("Total Cash in ATM: ₹" + total);

	        sc.close();
	    }
	}

