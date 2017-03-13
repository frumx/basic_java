package Zad2_Wyjatki;

import java.math.BigInteger;
import java.net.StandardSocketOptions;

public class Account {
	private double balance;
	private String number;

	public Account(String number) {
		this.number = number;
	}

	public void deposit(double amount) {
		this.setBalance(this.getBalance() + amount);
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			balance -= amount;
		} else {
			throw new InsufficientFundsException("Brak srodkow na koncie");
		}
	}

	public static void main(String args[]) {
		/*
		 * System.out.println(Integer.MAX_VALUE);
		 * System.out.println(Long.MAX_VALUE); BigInteger reallyBig = new
		 * BigInteger("1324565765342432345654345"); reallyBig.add(new
		 * BigInteger("12345"));
		 */

		Account myAccount = new Account("13456754321234543");
		myAccount.deposit(13234);
		System.out.println("Mamy na koncie " + myAccount.getBalance());
		try {
			myAccount.withdraw(100000);

		} catch (InsufficientFundsException e) {
			System.out.println("Niewystarczajaca liczba srodkow na koncie");
		}
		
		System.out.println("Mamy na koncie " + myAccount.getBalance());
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
