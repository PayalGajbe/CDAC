/*
 Implement a system to calculate and display the monthly payments for a mortgage loan. The system should:
1.	Accept the principal amount (loan amount), annual interest rate, and loan term (in years) from the user.
2.	Calculate the monthly payment using the standard mortgage formula:
o	Monthly Payment Calculation:
	monthlyPayment = principal * (monthlyInterestRate * (1 + monthlyInterestRate)^(numberOfMonths)) / ((1 + monthlyInterestRate)^(numberOfMonths) - 1)
	Where monthlyInterestRate = annualInterestRate / 12 / 100 and numberOfMonths = loanTerm * 12
	Note: Here ^ means power and to find it you can use Math.pow( ) method
3.	Display the monthly payment and the total amount paid over the life of the loan, in Indian Rupees (₹).
Define the class LoanAmortizationCalculator with fields, an appropriate constructor, getter and setter methods, a toString method and business logic methods. Define the class LoanAmortizationCalculatorUtil with methods acceptRecord, printRecord, and menuList. Define the class Program with a main method and test the functionality of the utility class.
 
 */
package in.assignment5;
import java.util.Scanner;


class LoanAmortizationCalulator{
	 double principalAmount;
	 double interestRate;
	 int loanTerm;
	 double monthlyPayment;
	 double monthlyInterestRate;
	 double numberOfMonths;
	
	public LoanAmortizationCalulator() {
		
	}
	
	public LoanAmortizationCalulator(double principalAmount, double interestRate, int loanTerm) {
		this.principalAmount = principalAmount;
		this.interestRate = interestRate;
		this.loanTerm = loanTerm;
	}
	
	public void setPA(double principalAmount) {
		this.principalAmount = principalAmount;
	}
	
	public double getPA() {
		return this.principalAmount;
	}
	
	public void setIR(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double getIR() {
		return this.interestRate;
	}
	
	public void setLT(int loanTerm) {
		this.loanTerm = loanTerm;
	}
	public double getLT() {
		return this.loanTerm;
	}
}	
class LoanAmortizationCalculatorUtil {
	LoanAmortizationCalulator LA = new LoanAmortizationCalulator();
	static Scanner sc = new Scanner(System.in);
	public void acceptRecord() {
		System.out.println("Enter principal amount (loan amount), annual interest rate, and loan term (in years)");
		LA.setPA(sc.nextDouble());
		LA.setIR(sc.nextFloat());
		LA.setLT(sc.nextInt());;
	}/*System.out.println("enter original price");
		dis.setOp(sc.nextInt());*/
	
	public void calculateMonthlyPayment() {
		LA.monthlyInterestRate = LA.interestRate / 12 / 100;
		LA.numberOfMonths = LA.loanTerm * 12;
		LA.monthlyPayment = LA.principalAmount * (LA.monthlyInterestRate * Math.pow(1 + 
				LA.monthlyInterestRate, LA.numberOfMonths)) / (Math.pow(1 + LA.monthlyInterestRate, LA.numberOfMonths) - 1);
	}
	
	public String toString() {
		return "Monthly payment is "+String.format("%.2f", LA.monthlyPayment)+" ₹ and the total amount paid over the life of the loan is "+String.format("%.2f", (LA.principalAmount)+(LA.monthlyPayment)*(LA.numberOfMonths)) +" ₹.";
	}
}
	
public class Program1 {
	
	public static void main(String[] args) {
		LoanAmortizationCalculatorUtil la = new LoanAmortizationCalculatorUtil();
		la.acceptRecord();
		la.calculateMonthlyPayment();
		System.out.println(la);

	}

}