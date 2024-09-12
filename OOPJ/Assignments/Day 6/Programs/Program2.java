/*
 2.	Declare a single-dimensional array of 5 integers inside the main method. Define a method named acceptRecord to get input from the terminal into the array and another method named printRecord to print the state of the array to the terminal.
 */
package Assi6p1;

import java.util.Scanner;

public class Program2 {

	private static Scanner sc = new Scanner(System.in);
	static void acceptRecord(int[] arr) {
		for(int index=0; index<arr.length;++index) {
			System.out.println("Enter arr["+index+"] : "  );
			arr[index] = sc.nextInt();
		}
	}
	
	static void printRecord(int[] arr) {
		for(int index=0; index < arr.length;++index) {
			System.out.println(arr[index]);
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[5];
		Program2.acceptRecord(arr);
		Program2.printRecord(arr);
		Program2.sc.close();
	}

}
