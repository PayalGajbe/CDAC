/*
24. Write a program to print the following pattern: 
1 
22 
333 
4444 
55555 

*/



class Program24{
	 public static void main(String[] args){
		 int i,j;
		 for(i = 1; i<6 ; i++){
			 for(j = 0; j < i ; j++){
				 System.out.print(i);
				 }
			
		 System.out.println();
		 }
	 }
}