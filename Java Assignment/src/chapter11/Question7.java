package chapter11;

import java.util.*;
class Account {
	private int id;
	private double balance;
	private double annualInteretRate;
	private Date dateCreated;

	Account() {		
		id = 0;
		balance = 0;
		annualInteretRate = 0;
		dateCreated = new Date();
	}

	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}

	int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	double getAnnualInterestRate() {
		return annualInteretRate;
	}

	public void setAnnualInterestRate(double annualInteretRate) {
		this.annualInteretRate = annualInteretRate;
	}

	 Date getDateCreated() {
		return dateCreated;
	}

	double getMonthlyInterestRate() {
		return annualInteretRate / 12;
	}

	double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100.0);
	}

	public void withdraw(double amt) {
		if (amt < balance)
			balance = balance - amt;
		else
			System.out.println("Amount to be withdrawn is less than the current balance");
	}

	public void deposit(double amt) {
		balance += amt;
	}
}

public class Question7 {
	public static void main(String[] args) throws java.lang.Exception {
		Account a1 = new Account(1122, 20000);
		a1.setAnnualInterestRate(4.5);
		a1.withdraw(2500);
		a1.deposit(3000);
		System.out.println("The balance is " + a1.getBalance() + " and the monthly interest is "
				+ a1.getMonthlyInterest() + ".\nThe account was created on " + a1.getDateCreated());
	}
}
