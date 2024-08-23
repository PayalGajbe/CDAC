//1. Write a program to calculate the sum of the first 50 natural numbers.

class NaturalNum{
	public static void main(String[] args){
		int count = 0;
		
		for(int i = 0; i<=50 ; i++){
			count += i;
		}
		System.out.print("The sum of the first 50 natural numbers: "+count);
	}
}