/*
7.Write a program to calculate the sum of the digits of the number 9876. The output should be 
30 (9 + 8 + 7 + 6).
*/
class sumOfDigits{
	public static void main(String[] args){
		int number = 9876;
		int sum = 0, digit;
		
		while(number > 0){
			digit = number%10;
			sum += digit;
			number = number / 10;
		}
		System.out.print(sum);
		
	}
}