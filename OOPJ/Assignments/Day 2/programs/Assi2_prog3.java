/*3)Write a program that checks if a person is eligible to vote based on their age.*/
package practice;
import java.util.*;
public class Assi2_prog3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		sc.close();
		if (age >= 18) {
			System.out.println("You are eligible for voting.");
		} else {
			System.out.println("You are not eligible for voting.");
		}

	}

}
