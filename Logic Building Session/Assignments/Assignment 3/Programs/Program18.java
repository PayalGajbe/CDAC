/*
18. Write a program to print the following pattern: 
   * 
  *** 
 ***** 
 ******* 
 ***** 
  *** 
   * 

*/
class Program18{
	public static void main(String[] args){
		int n=4,i,j;
		for(i=1;i<=n;i++){
			for(j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(j=1;j<=i*2-1;j++){
				System.out.print("*");
			}
		System.out.println();
		}
		for(i=n-1;i>0;i--){
			for(j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(j=1;j<=i*2-1;j++){
				System.out.print("*");
			}
		System.out.println();
		}
	}
}