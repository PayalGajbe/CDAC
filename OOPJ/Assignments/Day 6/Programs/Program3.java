package Assi6p1;


import java.util.Arrays;
import java.util.Scanner;

/*3.	Write a program to find the maximum and minimum values in a single-dimensional array of integers.*/
public class Program3 {
	
	static Scanner sc = new Scanner(System.in);
	public static void acceptRecord(int[] arr) {
		for(int index = 0; index < arr.length; index++) {
			System.out.print("enter arr["+index+"] : ");
			arr[index] = sc.nextInt();
		}
	}
	public static void printRecord(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Minimum value is "+arr[0]);
		System.out.println("Maximum value is "+arr[arr.length-1]);
	
	}
	public static void main(String[] args) {
		int[ ] arr = new int[5];
		Program3.acceptRecord(arr);
		Program3.printRecord(arr);
		
	}

}
