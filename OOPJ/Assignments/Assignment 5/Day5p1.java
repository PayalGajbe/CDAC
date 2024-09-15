package org.day5oops;

import java.awt.Choice;
import java.util.Scanner;

/*1)	Create a base class BankAccount with methods like deposit() and withdraw(). Derive a class SavingsAccount that overrides the withdraw() method to impose a limit on the withdrawal amount. Write a program that demonstrates the use of overridden methods and proper access modifiers & return the details.*/
//with getter and setter

class BankAccount{
	private long AcountNumber;
	private long Balance;
	long AmountDeposit;
	long AmountWithdraw;
	static Scanner sc = new Scanner(System.in);
	public BankAccount() {	
	}
	
	public BankAccount(long acountNumber, long balance, long amountDeposit, long amountWithdraw) {
		super();
		AcountNumber = acountNumber;
		Balance = balance;
		AmountDeposit = amountDeposit;
		AmountWithdraw = amountWithdraw;
	}

	public void setAccountNumber(long Accoutnumber) {
		this.AcountNumber = Accoutnumber;
	}
	public long getAcountNumber() {
		return AcountNumber;
	}
	public void setBalance(long Balance) {
		this.Balance = Balance;
	}
	public long getBalance() {
		return Balance;
	}
	public void setAmountDeposit(long amountDeposit) {
		AmountDeposit = amountDeposit;
	}
	public long getAmountDeposit() {
		return AmountDeposit;
	}
	public void setAmountWithdraw(long amountWithdraw) {
		AmountWithdraw = amountWithdraw;
	}
	public long getAmountWithdraw() {
		return AmountWithdraw;
	}
	
	public void acceptRecord() {
		System.out.println("AccountNumber: ");
		setAccountNumber(sc.nextLong());
		System.out.println("Balance: ");
		setBalance(sc.nextLong());
	}
	
	public void deposit() {
		System.out.println("Amount to deposit: ");
		setAmountDeposit(sc.nextLong());
		Balance = Balance + AmountDeposit;
		System.out.println("New Balance: "+Balance);
	}
	
	public void WithDraw() {
		System.out.println("Amount to withdraw: ");
		setAmountWithdraw(sc.nextLong());
		Balance =  Balance - AmountWithdraw;
		System.out.println("New Balance: "+Balance);
	}
	
	public String toString() {
		return String.format("Accout Number: %-5d Balance: %-5d", getAcountNumber(),getBalance());
	}
	
	public int menuList() {
		System.out.println("choice...");
		System.out.println("\n0.Exit");
		System.out.println("1.deposit");
		System.out.println("2.withdraw");
		System.out.println("3.printRecord");
		int choice = sc.nextInt();
		return choice;
	}
	
}
class SavingsAccount extends BankAccount{
	private long limit = 100000;
	
	@Override
	public void WithDraw() {
		if (getBalance() < limit) System.out.println("Insufficent Balance");
		else super.WithDraw();
	}
	
	
}

public class Day5p1 {

	public static void main(String[] args) {
		BankAccount sa = new SavingsAccount();
		sa.acceptRecord();
		int Choice;
		while((Choice = sa.menuList()) != 0) {
			switch (Choice) {
			case 1:
				sa.deposit();
				break;
			case 2:
				sa.WithDraw();
				break;
			case 3:
				System.out.println(sa);
			default:
				break;
			}
		}
		
	}

}
