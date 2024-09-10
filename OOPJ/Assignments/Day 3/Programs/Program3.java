/*
3. BMI (Body Mass Index) Tracker
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
Define class BMITracker with methods acceptRecord, calculateBMI, classifyBMI & printRecord and test the functionality in main method.
 
 */

package in.assignment3;
import java.util.Scanner;

//class BMITracker
class BMITracker{
	private float weight;
	private float height;
	private float BMI;
	private String res;
	
	static Scanner sc = new Scanner(System.in);
	
	public void acceptRecord() {
		System.out.println("Enter your weight(kg): ");
		this.weight = sc.nextFloat();
		
		System.out.println("Enter your height(meters): ");
		this.height = sc.nextFloat();
		
		}
	
	public void calculateBMI() {
		BMI = weight / (height * height);
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
	
	public void printRecord() {
		System.out.printf("Your BMI is "+String.format("%.2f",BMI)+" and you are "+res);
	}
	
	
}

public class Program3 {
    public static void main(String[] args) {
		BMITracker b = new BMITracker();
		b.acceptRecord();
		b.calculateBMI();
		b.classifyBMI();
		b.printRecord();
	}

}
