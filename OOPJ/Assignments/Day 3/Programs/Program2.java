/*2. Compound Interest Calculator for Investment
Develop a system to compute the future value of an investment with compound interest. The system should:
1.	Accept the initial investment amount, annual interest rate, number of times the interest is compounded per year, and investment duration (in years) from the user.
2.	Calculate the future value of the investment using the formula:
o	Future Value Calculation:
	futureValue = principal * (1 + annualInterestRate / numberOfCompounds)^(numberOfCompounds * years)
o	Total Interest Earned: totalInterest = futureValue - principal
3.	Display the future value and the total interest earned, in Indian Rupees (₹).
Define class CompoundInterestCalculator with methods acceptRecord , calculateFutureValue, printRecord and test the functionality in main method.
*/
package in.assignment3;

import java.util.Scanner;

class CompoundInterestCalculator {
	double inAmount;
	double annualInterestRate;
	double interestCompounded;
	double duration;
	double futureValue;
	double interestEarned;
	
	static Scanner sc = new Scanner(System.in);
	
	public void acceptRecord() {
		System.out.println("Enter initial investment amount, annual interest rate, number of times the interest is compounded per year, and investment duration (in years): ");
		this.inAmount = sc.nextDouble();
		this.annualInterestRate = sc.nextDouble();
		this.interestCompounded = sc.nextDouble();
		this.duration =sc.nextDouble();
	}
	
	public void calculateFutureValue() {
		this.futureValue = inAmount * Math.pow((1 + annualInterestRate / interestCompounded),(interestCompounded * duration));
		this.interestEarned = futureValue - inAmount;
	}
	 public void printRecord() {
		 System.out.printf("the future value is "+String.format("%.2f", futureValue)+" ₹ and the total interest earned is "+ String.format("%.2f", interestEarned)+" ₹");
	 }
	
}


public class Program2 {

	public static void main(String[] args) {
		CompoundInterestCalculator cc = new CompoundInterestCalculator();
		cc.acceptRecord();
		cc.calculateFutureValue();
		cc.printRecord();
	}

}
