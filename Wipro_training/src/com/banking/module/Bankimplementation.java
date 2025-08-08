package com.banking.module;

public class Bankimplementation {
	Bankaccount[] customers = new Bankaccount[10]; 
    int count = 0;

    public void registerCustomer(Bankaccount c) {
        if (count < customers.length) {
            customers[count] = c;
            count++;
            System.out.println("Account was  registered.\n");
        } else {
            System.out.println("account was not registered.");
        }
    }

    public void showaccountDetails(int id) {
        for (int i = 0; i < count; i++) {
                System.out.println("Name " + customers[i]. Accountholder());
                System.out.println("Number " + customers[i].Accountnumber());
                System.out.println("Balance: " + customers[i].Accountbalance());
                return;
            }
        System.out.println("Customer not found.");

    }   
}
