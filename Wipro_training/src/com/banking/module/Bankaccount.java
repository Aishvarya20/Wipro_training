package com.banking.module;

public class Bankaccount {
		private String Name;
		private int number;
		private int Balance;
		
		public void setName(String Accountholder)
		 {
			 Name = Accountholder; 
		 }
		public void setnumber(int Accountnumber)
		 { 
			 number = Accountnumber; 
		 }
		
		 public void setBalance(int Accountbalance)
		 {
			 Balance = Accountbalance; 
		
		 }
		 public String Accountholder() {     
		        return  Name;
		    }
		 public int Accountnumber() {     
		        return  number;
		    }
		 public int Accountbalance() {     
		        return  Balance;
		    }
		 public void deposit(int amount) {
		        Balance += amount;
		    }

		    public void withdraw(int amount) {
		        if (amount <= Balance) {
		            Balance -= amount;
		        } else {
		            System.out.println("Insufficient Balance!");
		        }
		    }
}


