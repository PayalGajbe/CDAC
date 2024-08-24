/*
9. Write a program to find and print the largest digit in the number 4825.
*/
class largestDigit{
	public static void main(String[] args){
		int n = 4825;
		int largest = 0, digit;
		while(n > 0){
			digit = n%10;
			if(digit > largest){
				largest = digit;
			}
			n = n/10;
		}
		System.out.println("The largest of all digit is "+largest);
	}
}