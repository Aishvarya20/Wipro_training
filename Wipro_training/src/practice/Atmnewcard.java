package practice;
import java.util.Scanner;

	class WrongPinException extends Exception {
	    public WrongPinException(String message) {
	        super(message);
	    }
	}
	
	class InsufficientBalanceException extends Exception {
	    public InsufficientBalanceException(String message) {
	        super(message);
	    }
	}

	class NoAccountFoundException extends Exception {
	    public NoAccountFoundException(String message) {
	        super(message);
	    }
	}
   class user {
		private  String AccountHolderName;
		private  int Accountnumber;
		private int Accountbalance;
		private int Accountpin;
		
		
		 public user(String name , int number , int balance, int pin) {
			this.AccountHolderName = name;
	        this.Accountnumber = number;
	        this.Accountbalance = balance;
	        this.Accountpin = pin;
	    }
		public class Atmnewcard {
		    static  user[] users = new  user[5];
		    static int userCount = 0;
		    Scanner sc = new Scanner(System.in);

		    public static void main(String[] args) {
		        users[userCount] = new user("Aishvarya",98765, 50000,1234);
		        userCount = userCount + 1;

		        users[userCount] = new user("likitha",5475,80000,6589);
		        userCount = userCount + 1;

		        users[userCount] = new user("meena",9875,60000,9875);
		        userCount = userCount + 1;

		        System.out.println("Welcome to ATM");
		        try {
		        	user currentuser = login();
		        	 showMenu(currentuser);
		        }catch (Exception e) {
		        	System.out.println("Login failed: " + e.getMessage());
		        }finally {
		            System.out.println("Thank you for using ABC ATM.");
		        }        
		    }
		    public static user login() throws  NoAccountFoundException, WrongPinException{
		        System.out.print("Enter Account Number: ");
		        int  AccountHolderName = sc.nextInt();

		        System.out.print("Enter PIN: ");
		        int Accountpin = sc.nextInt();

		        for (int i = 0; i < userCount; i++) {
		            if (users[i].
		                if (users[i].pin == pin) {
		                    System.out.println("Login successful!\n");
		                    return users[i];
		                } else {
		                    throw new WrongPinException("Incorrect PIN entered.");
		                }
		            }
		        }
		        throw new NoAccountFoundException("Account not found.");
		    }
		    
		       
}
