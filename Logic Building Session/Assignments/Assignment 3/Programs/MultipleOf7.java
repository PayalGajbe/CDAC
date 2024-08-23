//3. Write a program to print all multiples of 7 between 1 and 100. 
class MultipleOf7{
	public static void main(String[] args){
	
		for(int i = 0; i<=100; i++){
			int mul = 7*i;
			System.out.println("7 X "+i+" = "+mul);
		}
	}
}