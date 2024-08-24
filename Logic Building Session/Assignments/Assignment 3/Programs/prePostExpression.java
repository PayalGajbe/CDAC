/*
11. Write a Java program to demonstrate the use of both pre-increment and post-decrement 
operators in a single expression 

*/
class prePostExpression{
	public static void main(String[] args){
		int a = 5;
		int b = 2;
		
		//pre-increment
		a = ++a + b; //here a was 5 but after increment it is be 6 before use.
	//  a = 1+5 + 2  i.e 8
		System.out.println(a);
		
		//post-increment
		a = a++ + b; //here a is 8 before us and then after increment it is 9.
	//  a = 8 + 2  i.e 10  but now a = 9
		System.out.println(a);
	
	}
}