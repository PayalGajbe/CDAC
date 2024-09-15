package Assi4;
/*) Write a Program that demonstrates widening conversion from int to (double,float, boolean, string)  and prints the result.*/
public class Assi4p4 {

	public static void main(String[] args) {
		int num1 = 10;
		
		double num2 = num1;
		System.out.println(num2);
		
		float num3 = num1;
		System.out.println(num3);
		
		//boolean num4 = (boolean) num1; //does not work
		
		String num5 = Integer.toString(num1);
		System.out.println(num5);
	}

}
