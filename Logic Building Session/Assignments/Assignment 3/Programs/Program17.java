/*
17. Write a program to print the following pattern: 
 ***** 
  **** 
  *** 
  ** 
  * 
*/
class Program17{
	public static void main(String[] args) {
		int n = 5;
		for(int i = 0; i<n;i++){
			for(int j = 0; j<n ;j++){
				if(i>j){
					System.out.print(" ");
				}else{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}