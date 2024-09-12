/*
  2. Compound Interest Calculator for Investment
Develop a system to compute the future value of an investment with compound interest. The system should:
1.	Accept the initial investment amount, annual interest rate, number of times the interest is compounded per year, and investment duration (in years) from the user.
2.	Calculate the future value of the investment using the formula:
o	Future Value Calculation:
	futureValue = principal * (1 + annualInterestRate / numberOfCompounds)^(numberOfCompounds * years)
o	Total Interest Earned: totalInterest = futureValue - principal
3.	Display the future value and the total interest earned, in Indian Rupees (₹).
Define the class CompoundInterestCalculator with fields, an appropriate constructor, getter and setter methods, a toString method and business logic methods. Define the class CompoundInterestCalculatorUtil with methods acceptRecord, printRecord, and menuList. Define the class Program with a main method to test the functionality of the utility class.


 */
package in.assignment5;
import java.util.Scanner;

class CompoundInterestCalculator {
	double inAmount;
	double annualInterestRate;
	double interestCompounded;
	double duration;
	
	public CompoundInterestCalculator() {
		
	}
	
	public double getInAmount() {
		return inAmount;
	}

	public void setInAmount(double inAmount) {
		this.inAmount = inAmount;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getInterestCompounded() {
		return interestCompounded;
	}

	public void setInterestCompounded(double interestCompounded) {
		this.interestCompounded = interestCompounded;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

}
class CompoundInterestCalculatorUtil{
	double futureValue;
	double interestEarned;
	CompoundInterestCalculator c = new CompoundInterestCalculator();
	static Scanner sc = new Scanner(System.in);
	
	public void acceptRecord() {
		System.out.println("Enter initial investment amount, annual interest rate, number of times the interest is compounded per year, and investment duration (in years): ");
		c.setInAmount(sc.nextDouble());
		c.setAnnualInterestRate(sc.nextDouble());
		c.setInterestCompounded(sc.nextDouble());
		c.setDuration(sc.nextInt());
	}
	
	public void calculateFutureValue() {
		this.futureValue = c.inAmount * Math.pow((1 + c.annualInterestRate / c.interestCompounded),(c.interestCompounded * c.duration));
		this.interestEarned = futureValue - c.inAmount;
	}
	 public String toString() {
		 return "the future value is "+String.format("%.2f", futureValue)+" ₹ and the total interest earned is "+ String.format("%.2f", interestEarned)+" ₹";
	 }
	public static int menulist() {
		System.out.println("0.Exit");
		System.out.println("1.Accept Record");
		System.out.println("2.Print Record");
		System.out.println("Enter choice:");
		int choice = sc.nextInt();
		return choice;
	}
}

public class Program2 {

	public static void main(String[] args) {
		CompoundInterestCalculatorUtil cc = new CompoundInterestCalculatorUtil();
		int choice;
		while((choice = CompoundInterestCalculatorUtil.menulist()) != 0) {
			switch (choice) {
			case 1:
				cc.acceptRecord();
				cc.calculateFutureValue();
				break;
			case 2:
				System.out.println(cc);
				break;
			}
		}
		
	}

}
