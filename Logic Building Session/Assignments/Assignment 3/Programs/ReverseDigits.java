//4. Write a program to reverse the digits of the number 1234. The output should be 4321.
class ReverseDigits{
	public static void main(String[] args){
		int number = 1234;
		int reverse = 0;
		while (number>0){
			reverse = reverse * 10 + number % 10;
			number = number/10;
			
		}
		System.out.println(reverse);
	}
}