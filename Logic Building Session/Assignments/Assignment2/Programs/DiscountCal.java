/*
Question 4: Discount Calculation  
Write a program to calculate the discount based on the total purchase amount. Use the following 
criteria: 
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
 If the total purchase is less than Rs.500, apply a 5% discount. 
Additionally, if the user has a membership card, increase the discount by 5%.
*/

class DiscountCal{
	public static void main(String[] args){
		int amount = 600;
		double dis = 0;
		String member= "Y";
		float membershipDiscount = 0.05f;
		
		if(amount >= 1000){
			if(member == "Y"){
				dis = amount*0.2 + amount*0.05;
				System.out.println("The price is "+ (amount - dis));
			}else{
				dis = amount*0.2;
				System.out.println("The price is "+ (amount - dis));
			}
				
		} else if(amount > 500 && amount <= 999){
			if(member == "Y"){
				dis = amount*0.1 + amount*0.05;
				System.out.println("The price is "+ (amount - dis));
			}else{
				dis = amount*0.1;
				System.out.println("The price is "+ (amount - dis));
			}
		} else {
			if(member == "Y"){
				dis = amount*0.05 + amount*0.05;
				System.out.println("The price is "+ (amount - dis));
			}else{
				dis = amount*0.05;
				System.out.println("The price is "+ (amount - dis));
			}
		}
	}
}