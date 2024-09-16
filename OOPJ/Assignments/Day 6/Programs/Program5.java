package Assi6p1;
/*
5.	Write a program to find the intersection of two single-dimensional arrays.
 */
import java.util.Scanner;

public class Program5 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Number of elements in first array: ");
	        int n1 = sc.nextInt();
	        int[] arr1 = new int[n1];
	        System.out.println("Enter elements: ");
	        for (int i = 0; i < n1; i++) {
	            arr1[i] = sc.nextInt();
	        }

	        System.out.print("Number of elements in  second array: ");
	        int n2 = sc.nextInt();
	        int[] arr2 = new int[n2];
	        System.out.println("Enter elements: ");
	        for (int i = 0; i < n2; i++) {
	            arr2[i] = sc.nextInt();
	        }
	        System.out.println("Intersection of the two arrays:   ");
	        for (int i = 0; i < n1; i++) {
	            for (int j = 0; j < n2; j++) {
	                if (arr1[i] == arr2[j]) {
	                    System.out.print(arr1[i] + " ");
	                    break;
	                }
	            }
	        sc.close();

	        
	    }
	    
}}

