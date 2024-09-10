/*
 1. Loan Amortization Calculator
Implement a system to calculate and display the monthly payments for a mortgage loan. The system should:
1.	Accept the principal amount (loan amount), annual interest rate, and loan term (in years) from the user.
2.	Calculate the monthly payment using the standard mortgage formula:
o	Monthly Payment Calculation:
	monthlyPayment = principal * (monthlyInterestRate * (1 + monthlyInterestRate)^(numberOfMonths)) / ((1 + monthlyInterestRate)^(numberOfMonths) - 1)
	Where monthlyInterestRate = annualInterestRate / 12 / 100 and numberOfMonths = loanTerm * 12
	Note: Here ^ means power and to find it you can use Math.pow( ) method
3.	Display the monthly payment and the total amount paid over the life of the loan, in Indian Rupees (₹).
Define class LoanAmortizationCalculator with methods acceptRecord, calculateMonthlyPayment & printRecord and test the functionality in main method.

 */
package comp.tech;
import java.util.Scanner;

class LoanAmortizationCalulator{
	private double principalAmount;
	private double interestRate;
	private int loanTerm;
	private double monthlyPayment;
	private double monthlyInterestRate;
	private double numberOfMonths;
	
	static Scanner sc = new Scanner(System.in);
	
	public void acceptRecord() {
		System.out.println("Enter principal amount (loan amount), annual interest rate, and loan term (in years)");
		this.principalAmount = sc.nextFloat();
		this.interestRate = sc.nextFloat();
		this.loanTerm = sc.nextInt();
	}
	
	public void calculateMonthlyPayment() {
		this.monthlyInterestRate = interestRate / 12 / 100;
		this.numberOfMonths = loanTerm * 12;
		this.monthlyPayment = principalAmount * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) / (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
	}
	
	public void printRecord() {
		System.out.println("Monthly payment is "+String.format("%.2f", monthlyPayment)+" ₹ and the total amount paid over the life of the loan is "+String.format("%.2f", (principalAmount)+(monthlyPayment)*(numberOfMonths))+" ₹.");
	}

}
public class Program1 {
	
	public static void main(String[] args) {
		LoanAmortizationCalulator la = new LoanAmortizationCalulator();
		la.acceptRecord();
		la.calculateMonthlyPayment();
		la.printRecord();

	}

}
