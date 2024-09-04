package practice;

import java.util.Scanner;

public class Assi2_prog1_switchcase {

	public static void main(String[] args) {
		//Ask for input year
		System.out.println("Enter the year you want to check for: ");
		//take input in variable year
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		int y = (year%4==0 || year%400==0 && year%100!=0) ? 1 : 0;
		//switch case for leap year
		switch(y) {
		case 1: System.out.println("It is a leap year");
				break;
		case 0: System.out.println("Not a leap year");
				break;
		default:System.out.println("Not a leap year");
				break;
			
		}
		

	}

}
