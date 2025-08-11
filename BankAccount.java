package BankAccountSimulation;
	
	import java.util.ArrayList;
	import java.util.List;

	// Bank Account class
	class BankAccount {
	    private String accountHolder;
	    private double balance;
	    private List<String> transactions;

	    public BankAccount(String accountHolder) {
	        this.accountHolder = accountHolder;
	        this.balance = 0.0;
	        this.transactions = new ArrayList<>();
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            transactions.add("Deposited: $" + amount);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            transactions.add("Withdrew: $" + amount);
	        } else {
	            System.out.println("Invalid withdraw amount or insufficient balance.");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void printAccountSummary() {
	        System.out.println("\nAccount Holder: " + accountHolder);
	        System.out.println("Current Balance: $" + balance);
	        System.out.println("Transaction History:");
	        for (String t : transactions) {
	            System.out.println(" - " + t);
	        }
	    }
	}



