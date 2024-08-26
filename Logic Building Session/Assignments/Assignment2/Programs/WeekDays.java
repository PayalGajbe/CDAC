/*
Question 2: Days of the Week  
Write a program that uses a nested switch statement to print out the day of the week based on an 
integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it 
is a weekday or weekend. 
*/

class WeekDays{
	public static void main(String[] args){
		int day = 7;
		
		switch(day){
			case 1:
				System.out.println("Today is monday");
				break;
			case 2:
				System.out.println("today is tuesday");
				break;
			case 3:
				System.out.println("today is wednesday");
				break;
			case 4:
				System.out.println("today is Thrusday");
				break;
			case 5:
				System.out.println("today is Friday");
				break;
			case 6:
				System.out.println("today is saturday");
				break;
			case 7:
				System.out.println("today is sunday");
				break;
			default:
				System.out.println("invalid input");
				break;
		
			}
			if(day >= 1 && day <=5){
				System.out.println("Its a Weekday");
			} else {
				System.out.println("Its a Weekend");				
			}
	}
}
	