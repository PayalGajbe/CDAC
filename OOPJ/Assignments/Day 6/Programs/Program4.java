package Assi6p1;

import java.util.Scanner;

/*4.	Write a program to remove duplicate elements from a single-dimensional array of integers.*/
public class Program4 {

	 public static int removeElements(int arr[], int n) {  
	      if (n == 0 || n == 1) {  
	            return n;  
	      }  
	      int[] temp = new int[n];
	      int j = 0;  
	      for (int i = 0; i < n - 1; i++) {  
	          if (arr[i] != arr[i + 1]) {  
	              temp[j++] = arr[i];  
	          }  
	      }  
	      temp[j++] = arr[n - 1]; 
	       
	      for (int i = 0; i < j; i++) {  
	            arr[i] = temp[i];  
	      }  
	      return j;  
	    }  
	       
	    public static void main(String[] args) {  
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter the number of elements in the array: ");
	        int n = sc.nextInt();
	        
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " elements in sorted order (duplicates allowed):");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            arr[i] = sc.nextInt();
	        }

	        int length = removeElements(arr, n);  
	        
	        System.out.println("Array after removing duplicates:");
	        for (int i = 0; i < length; i++) {  
	           System.out.print(arr[i] + " ");  
	        }  
	        sc.close();
	}

}
