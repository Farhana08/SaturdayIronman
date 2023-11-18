package com.upskill.assignment_3;

public class Assignment_3_1 {
	
	 private String accountName;
	    private double balance;

	    public Assignment_3_1(String accountName, double initialAmount) {
	        this.accountName = accountName;
	        this.balance = initialAmount;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void displayAccountDetails() {
	        System.out.println("Account name: " + accountName);
	        System.out.println("Initial amount: " + balance);
	    }
	}

	class SavingsAccount extends Assignment_3_1 {
	    public SavingsAccount(String accountName, double initialAmount) {
	        super(accountName, initialAmount);
	    }
	}

	class CheckingAccount extends Assignment_3_1 {
	    public CheckingAccount(String accountName, double initialAmount) {
	        super(accountName, initialAmount);
	    }

	    public void withdraw(double amount, double balance) {
	        if (balance >= amount); {
	            balance -= amount;
	        
	        } else {
	        	
	            System.out.println("Insufficient funds. Withdrawal not allowed.");
	        }
	    }
	

	    public static void main(String[] args) {
	        SavingsAccount savingsAccount = new SavingsAccount("savings", 10000);
	        CheckingAccount checkingAccount = new CheckingAccount("checking", 20000);

	        savingsAccount.deposit(5000);
	        checkingAccount.deposit(6000);

	        savingsAccount.displayAccountDetails();
	        checkingAccount.displayAccountDetails();

	        checkingAccount.withdraw(3000);

	        checkingAccount.displayAccountDetails();
	    }

		private void withdraw(int i) {
			
			
		}
	}



