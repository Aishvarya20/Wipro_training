package abc;

public class Bank_account {

	public static void main(String[] args) {
		  Bank_acc b = new Bank_acc();

	        b.deposit(500);
	        b.withdraw(200);

	        System.out.println("Balance: ₹" + b.getBalance());
	    }
	}

