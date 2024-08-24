//6. Write a program to find and print the first 5 prime numbers.
class Prime5{
	public static void main(String[] args){
		int n = 5;
		int i = 2;
		while(n>0){
			int count=0;  //if n not a prime count gets +1
			for(int j = 2;j<=i;j++){
				if(i%j==0){   //check if % == 1then direct 16
					count++;  //if not check further
					if(count > 1){
						break;
					}
				}
		    }
			if(count == 1){
				System.out.println(i+" ");
				n--;      //since n=15 we need to do --
			}
			i++;
		}
		
	}
}