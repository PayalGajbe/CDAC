/*2)Implement a program that calculates the Body Mass Index (BMI) based on height and weight input using if-else to classify the BMI int categories (underweight, normal weight, overweight,etc).
Underweight: BMI is less than 18.5
Healthy weight: BMI is between 18.5 and 24.9
Overweight: BMI is between 25 and 29.9
Obese: BMI is between 30 and 39.9
Severely obese: BMI is 40 or higher
*/
package practice;
import java.util.*;
public class Assi2_program2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your height(in meters): ");
	float height = sc.nextFloat();
	System.out.println("Enter your weight(in kgs): ");
	Float weight = sc.nextFloat();
	sc.close();
	Float bmi;
	bmi = weight / (height*height);
	
	if (bmi < 18.5) {
		System.out.println("You are Underweight");
	}else if (bmi >= 18.5 && bmi<=24.9) {
		System.out.println("You are Healthy Weight");
	}else if (bmi >= 25 && bmi<=29.9) {
		System.out.println("You are OverWeight");
	}else if (bmi >= 30 && bmi<=39.9) {
		System.out.println("You are Obese");
	}else if (bmi >= 40) {
		System.out.println("You are Severely Obese");
	}
	}
}
