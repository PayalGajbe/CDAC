package Assi6p1;
/*6.	Write a program to find the missing number in an array of integers ranging from 1 to N.*/
import java.util.Scanner;
public class Program6 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter the value of n: ");
	        int n = sc.nextInt();
	        
	        int[] arr = new int[n - 1]; 
	        System.out.println("Enter " + (n - 1) + " elements between 1 and " + n + ":");
	        for (int i = 0; i < n - 1; i++) {
	            arr[i] = sc.nextInt();
	        }
	      
	        int expectedSum = n * (n + 1) / 2;
	        int actualSum = 0;
	        for (int i = 0; i < n - 1; i++) {
	            actualSum += arr[i];
	        }
 int missingnumber = expectedSum - actualSum;
	        
	        System.out.println("The missing number is: " + missingnumber);
	        sc.close();

	    }
	    }
