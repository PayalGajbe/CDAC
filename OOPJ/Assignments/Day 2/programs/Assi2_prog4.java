/*4)Write a program that takes a month (1-12) and prints the corresponding season (Winter, Spring, Summer, Autumn) using a switch case
Spring: March, April, May  
Summer: June, July, August 
Autumn: September, October, November 
Winter: December, January, February 

 */
package practice;
import java.util.*;

public class Assi2_prog4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month(1-12): ");
		int month = sc.nextInt();
		sc.close();
		
		switch (month) {
		case 12,1,2:System.out.println("Winter");
					break;
		case 3,4,5:System.out.println("Spring");
					break;
		case 6,7,8:System.out.println("Summer");
					break;
		case 9,10,11:System.out.println("Autumn");
					break;
		default:System.out.println("Invalid input");
				break;
			
		}
	}

}
