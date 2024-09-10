/*
4. Discount Calculation for Retail Sales
Design a system to calculate the final price of an item after applying a discount. The system should:
1.	Accept the original price of an item and the discount percentage from the user.
2.	Calculate the discount amount and the final price using the following formulas:
o	Discount Amount Calculation: discountAmount = originalPrice * (discountRate / 100)
o	Final Price Calculation: finalPrice = originalPrice - discountAmount
3.	Display the discount amount and the final price of the item, in Indian Rupees (₹).
Define the class DiscountCalculator with fields, an appropriate constructor, getter and setter methods, a toString method, and business logic methods. Define the class DiscountCalculatorUtil with methods acceptRecord, printRecord, and menuList. Define the class Program with a main method to test the functionality of the utility class.
 
*/

package in.assignment5;
import java.util.Scanner;

class DiscountCalculator{
	int originalPrice;
	int discountPercentage;
	
	public DiscountCalculator() {
		this.originalPrice = 0;
		this.discountPercentage = 0;
	}
	
	
	public void setOp(int oriPrice) {
		this.originalPrice = oriPrice;
	}
	
	public int getOP() {
		return this.originalPrice;
	}
	
	public void setDispercent(int disP) {
		this.discountPercentage = disP;
	}
	
	public int getdisP() {
		return this.discountPercentage;
	}
}

class DiscountCalculatorUtil{
	DiscountCalculator dis = new DiscountCalculator();
	int disAmount;
	int finalAmount;
	Scanner sc = new Scanner(System.in);
	
	public void acceptRecord() {
		System.out.println("enter original price");
		dis.setOp(sc.nextInt());
		System.out.println("enter discount percentage");
		dis.setDispercent(sc.nextInt());
	}
	
	public void CalculateDiscount() {
		disAmount = (dis.originalPrice * dis.discountPercentage/100);
		finalAmount = dis.originalPrice - disAmount;
	}
	

	public String toString() {
		return "Total price is " + this.finalAmount + "₹ total discount is "+ this.disAmount+ " ₹"; 
	}
}

public class Program4 {

	public static void main(String[] args) {
		DiscountCalculatorUtil cal = new DiscountCalculatorUtil();
		cal.acceptRecord();
		cal.CalculateDiscount();
		System.out.println(cal);

	}

}
