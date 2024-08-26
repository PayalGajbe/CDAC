/*
Question 3: Calculator  
Write a program that acts as a simple calculator. It should accept two numbers and an operator 
(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested if
else to check if division by zero is attempted and display an error message.
*/

class Calculator{
	public static void main(String args[]){
		int n1 = 10;
		int n2 = 0;
		char sigh = '/';
		
		switch (sigh){
			case '+':
				System.out.println("Addition is "+(n1 + n2));
				break;
			case '-':
				System.out.println("Substraction is "+(n1 - n2));
				break;
			case '*':
				System.out.println("Multiplication is "+(n1 * n2));
				break;
			case '/':
				if(n2 == 0){
					System.out.println("The value Of divisor is 0 which is an Exception");
				}else{
				System.out.println("Division is "+(n1 / n2));}
				break;
			default:
				System.out.println("Invalid Output");
		}
	}
}