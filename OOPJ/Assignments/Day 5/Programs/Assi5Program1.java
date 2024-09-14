package Assi5;
/*1.	Design and implement a class named InstanceCounter to track and count the number of instances created from this class.*/

class instanceCounter{
	static int count = 0;
	 
	{
		count++;
	}
	public int getCount(int count) {
		return count;
	}
	
}


public class Assi5Program1 {

	public static void main(String[] args) {
		
		instanceCounter i1 = new instanceCounter();
		instanceCounter i2 = new instanceCounter();
		instanceCounter i3 = new instanceCounter();
		instanceCounter i4 = new instanceCounter();
		System.out.println("number of time: "+instanceCounter.count);
	}
	

}
