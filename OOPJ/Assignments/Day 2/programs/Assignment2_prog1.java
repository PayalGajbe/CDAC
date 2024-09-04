package practice;
import java.util.*;
//1)Write a program that checks if a given year is a leap year or not using both if-else and switch-case.
public class Assignment2_prog1 {

	public static void main(String[] args) {
		//ask for year
		System.out.println("Enter the year you want to check for: ");
		//take input in variable year
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		//if-else for leap year
		if (year%4==0 || year%400==0 && year%100!=0 ) {
			System.out.println("Is a leap year");
		}else {
			System.out.println("Not a leap year");
		}
		
		
		

	}

}
