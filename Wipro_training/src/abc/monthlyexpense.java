package abc;
import java.util.Scanner;
public class monthlyexpense {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter family members: ");
	        int members = scanner.nextInt();

	        int[][] expenses = new int[members][];
	        for (int i = 0; i < members; i++) {
	            System.out.print("Enter number of expenses for member " + (i + 1) + ": ");
	            int items = scanner.nextInt();

	            expenses[i] = new int[items]; 

	            for (int j = 0; j < items; j++) {
	                System.out.print("Enter expense " + (j + 1) + " for member " + (i + 1) + ": ");
	                expenses[i][j] = scanner.nextInt();
	            }
	        }

	        System.out.println(" Expenses of all family memebers");
	        for (int i = 0; i < expenses.length; i++) {
	            System.out.print("Member " + (i + 1) + " expenses: ");
	            for (int j = 0; j < expenses[i].length; j++) {
	                System.out.print(expenses[i][j] + " ");
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }
	}
