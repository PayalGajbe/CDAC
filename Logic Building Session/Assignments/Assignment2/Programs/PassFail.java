/*
Question 5: Student Pass/Fail Status with Nested Switch 
Write a program that determines whether a student passes or fails based on their grades in three 
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
more subjects, print the number of subjects they failed in.
*/

class PassFail{
	public static void main(String[] args){
		int sub1 = 60;
		int sub2 = 40;
		int sub3 = 50;
		int pass = 0;
		int fail = 0;
		
		if (sub1 >= 40){
			pass++;
		} else {
			fail++;
		}
		if (sub2 >= 40){
			pass++;
		} else {
			fail++;
		}
		if (sub3 >= 40){
			pass++;
		} else {
			fail++;
		}
		
			
		if(pass==3){
			 System.out.println("Passed in all 3 subjects.");
		}else{
			 switch(fail){
				 case 1:System.out.println("Failed in 1 subject.");
						break;
				 case 2:System.out.println("Failed in 2 subject.");
						break;
				 case 3:System.out.println("Failed in 3 subject.");
						break;
				 
			 }
			 
		}
	
}
}

