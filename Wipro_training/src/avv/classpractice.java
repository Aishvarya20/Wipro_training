package avv;
import java.util.Scanner;

public class classpractice {
	public int add(int a , int b) {
		return a+b;
	}
	public int subtract(int a , int b) {
		return a-b;
	}
	public int multiply(int a , int b) {
		return a*b;
	}
	public int divide(int a , int b) {
		return a/b;
	}
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		classpractice calc = new classpractice();
		System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
		
		
		
	}
}