package Assi4;

import java.util.Scanner;

/*
 Write a program that performs arithmetic operations involving different data types (int, double, float) and observes how Java handles widening conversions automatically.
 */
public class Assi4P3 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter two nums: ");
	 int n1 = sc.nextInt();
	 double n2 = sc.nextDouble();
	 float n3 =  sc.nextFloat();
	 
	 double res1 = n1 + n2;
	 float res2 = n1 + n3;
	 double res3= n3 + n2;
	 
	 System.out.println(res1);
	 System.out.println(res2);
	 System.out.println(res3);
	 
	 double res4 = n1 * n2;
	 float res5= n1 * n3;
	 double res6= n3 * n2;
	 
	 System.out.println(res4);
	 System.out.println(res5);
	 System.out.println(res6);
	 
	 sc.close();
	}

}
