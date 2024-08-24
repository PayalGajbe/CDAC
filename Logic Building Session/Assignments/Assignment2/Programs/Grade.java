class Grade{
	public static void main(String args[]){
		int mark = 64;
		
		if(mark >= 90){
			System.out.println("A");
		} else if(mark>= 80 && mark <= 89){
			System.out.println("B");
		} else if(mark >= 70 && mark <= 79){
			System.out.println("C");
		} else if(mark >= 60 && mark <= 69){
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}