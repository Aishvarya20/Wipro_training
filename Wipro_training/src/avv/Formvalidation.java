package avv;
import java.util.Scanner;

	public class Formvalidation {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first num: ");
	        String num1 = sc.nextLine();
	        System.out.print("Enter second num: ");
	        String num2 = sc.nextLine();
	        Integer n1 = Integer.valueOf(num1); 
	        Integer n2 = Integer.valueOf(num2);
	        int sum = n1 + n2;
	        System.out.println("Sum is: " + sum);
	        sc.close();
	    }
	}

