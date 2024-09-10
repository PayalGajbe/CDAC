/*
4. Discount Calculation for Retail Sales
Design a system to calculate the final price of an item after applying a discount. The system should:
1.	Accept the original price of an item and the discount percentage from the user.
2.	Calculate the discount amount and the final price using the following formulas:
o	Discount Amount Calculation: discountAmount = originalPrice * (discountRate / 100)
o	Final Price Calculation: finalPrice = originalPrice - discountAmount
3.	Display the discount amount and the final price of the item, in Indian Rupees (C).
Define class DiscountCalculator with methods acceptRecord, calculateDiscount & printRecord and test the functionality in main method.

 */
package in.assignment3;
import java.util.Scanner;

class DiscountCalculator{
	int originalPrice;
	int discountPercentage;
	int disAmount;
	int finalAmount;
	
	static Scanner sc = new Scanner(System.in);
	
	public void acceptRecord() {
		System.out.println("enter original price");
		this.originalPrice = sc.nextInt();
		System.out.println("enter discount percentage");
		this.discountPercentage = sc.nextInt();
	}
	
	public void CalculateDiscount() {
		disAmount = (this.originalPrice * this.discountPercentage/100);
		finalAmount = this.originalPrice - disAmount;
	}
	
	public void printRecord() {
		System.out.println("The discount is of "+this.disAmount+" ₹ and the total is of "+this.finalAmount+" ₹.");
	}
	
}

public class Program4 {

	public static void main(String[] args) {
		DiscountCalculator cal = new DiscountCalculator();
		cal.acceptRecord();
		cal.CalculateDiscount();
		cal.printRecord();
		DiscountCalculator.sc.close();
	}
}

