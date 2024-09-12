/*
Create a system to calculate and classify Body Mass Index (BMI). The system should:
1.	Accept weight (in kilograms) and height (in meters) from the user.
2.	Calculate the BMI using the formula:
o	BMI Calculation: BMI = weight / (height * height)
3.	Classify the BMI into one of the following categories:
o	Underweight: BMI < 18.5
o	Normal weight: 18.5 ≤ BMI < 24.9
o	Overweight: 25 ≤ BMI < 29.9
o	Obese: BMI ≥ 30
4.	Display the BMI value and its classification.
Define the class BMITracker with fields, an appropriate constructor, getter and setter methods, a toString method, and business logic methods. Define the class BMITrackerUtil with methods acceptRecord, printRecord, and menuList. Define the class Program with a main method to test the functionality of the utility class.


*/
package in.assignment5;
import java.util.Scanner;
//class BMITracker
class BMITracker{
	private float weight;
	private float height;
	//private float BMI;
	//private String res;
	
	public BMITracker() {
		this(0.0f,0.0f);
	}
	
	public BMITracker(float weight, float height) {
		this.weight = weight;
		this.height = height;
	}
	
	public float getWeight() {
		return this.weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public float getHeight() {
		return this.height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
}

class BMITrackerUtil {
	static BMITracker b = new BMITracker();
	private float BMI;
	private String res;
	
	static Scanner sc = new Scanner(System.in);
	
	public void acceptRecord() {
		System.out.println("Enter your weight(kg): ");
		b.setWeight(sc.nextFloat());
		System.out.println("Enter your height(kg): ");
		b.setHeight(sc.nextFloat());
	}
	
	public void calculateBMI() {
		
		this.BMI = b.getWeight() / (b.getHeight() * b.getHeight());
	}
	
	public void classifyBMI() {
		if (BMI < 18.5f) {
			res = "Underweight";
		}
		else if(BMI >= 18.5f && BMI <=24.9f) {
			res = "Normal weight";
		}
		else if(BMI >= 25f && BMI <=29.9f) {
			res = "Over weight";
		}
		else if(BMI > 30f){
			res = "obese";
		}
	}
	
	public static int menulist() {
		System.out.println("0.Exit.");
		System.out.println("1.Accept Record.");
		System.out.println("2.Print Record.");
		System.out.print(" Enter choice	:	");
		int choice = sc.nextInt( );
		return choice;
	}
	
	public String toString() {
		
		return "bmi is "+this.BMI+" is "+this.res+"\n";
	}
	
}


public class Program3 {
  public static void main(String[] args) {
	  	int choice;
		BMITrackerUtil bi = new BMITrackerUtil();
		while( (choice = BMITrackerUtil.menulist()) != 0) {
			switch (choice) {
			case 1:
				bi.acceptRecord();
				bi.calculateBMI();
				bi.classifyBMI();
				break;
			case 2:
				System.out.print(bi);
				break;
			}
		}
		
	}

}

