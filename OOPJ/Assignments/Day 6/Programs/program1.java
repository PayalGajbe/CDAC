/*1.	Declare a single-dimensional array of 5 integers inside the main method. Traverse the array to print the default values. Then accept records from the user and print the updated values of the array.*/

package Assi6p1;

public class program1 {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		
		for(int index = 0; index <= arr.length - 1; index++) {
			System.out.println(arr[index]);
		}

	}

}
