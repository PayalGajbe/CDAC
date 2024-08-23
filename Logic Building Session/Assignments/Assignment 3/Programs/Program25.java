/*
25. Write a program to print the following pattern: 
1 
12 
123 
1234 
12345 
*/

class Program25{
	 public static void main(String[] args){
		 int i,j;
		 for(i = 1; i<6 ; i++){
			 for(j = 1; j <= i ; j++){
				 System.out.print(j);
			 }
			 System.out.println();
		 }
	 }
 }