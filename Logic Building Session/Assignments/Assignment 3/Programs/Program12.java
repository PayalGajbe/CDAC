/*12. Write a program to draw the following pattern: 
***** 
***** 
***** 
***** 
***** 
*/
class Program12{
	public static void main(String[] args){
		int i,j;
		for(i = 0; i<5 ;i++){
			for(j=0; j<5 ;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}