/*
16. Write a program to print the following pattern: 
    * 
   *** 
  ***** 
 ******* 
*********
*/

class Program16{
	public static void main(String[] args){
		for(int i=0;i<9;i+=2){
			for(int j=9-i;j>1;j--){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
		System.out.println();
		}
	}
}