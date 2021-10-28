//Aim: Java Program to Create Bank Account with Classes Savings, Current accounts. 
package lab4.banking;
import java.util.*;
public class BankAccount {
	String firstName;
	String lastName;
	String ssn;
	float balance;
	float deposit;
	float withdraw;
	long accountNumber;

	BankAccount() 
	{
		
	}

	BankAccount(String firstName, String lastName, String ssn, float balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.balance = balance;
	}

	long accountNumber() {
		long accountNumber = (long) Math.floor(Math.random() * 9000000000L) + 100000000L;
		return accountNumber;
	}

	public void deposit(float amount) {
		this.balance = this.balance + amount;
		System.out.println(firstName + " " + lastName + " " + "deposited" + amount + "current balance" + this.balance);
	}

	public void withdraw(float amount) {
		System.out.println("inside Withrdraw method");
		if (this.balance >= amount) {
			System.out.println("before" + this.balance);
			this.balance = this.balance - amount;
			System.out.println("after " + this.balance);
		}
		else {
			System.out.println(
					"unable to withdraw" + amount + "for" + firstName + " " + lastName + "due to insufficient funds");
		}
	}

}