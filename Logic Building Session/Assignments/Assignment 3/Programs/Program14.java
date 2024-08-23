/*14. Write a program to print the following pattern: 
 * 
 ** 
 *** 
 ***** 
 ******* 
 *********
 */
 class Program14{
	 public static void main(String[] args){
		 int i,j;
		 for(i=0;i<=9;i++){
            if(i%2==0&&i>2){
                continue;
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
          System.out.println();
         }

		 
	 }
 }
 