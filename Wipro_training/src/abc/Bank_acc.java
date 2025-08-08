package abc;

public class Bank_acc {
	    private int balance;
	    public void deposit(int amount) {
	        balance = balance + amount;
	        System.out.println("₹" + amount + " has been deposited.");
	    }

	    public void withdraw(int amount) {
	        if (amount <= balance) {
	            balance = balance - amount;
	            System.out.println("₹" + amount + " has been withdrawn.");
	        } else {
	            System.out.println("Insufficient balance! Cannot withdraw ₹" + amount);
	        }
	    }

	    public int getBalance() {
	        return balance;
	    }
	}


