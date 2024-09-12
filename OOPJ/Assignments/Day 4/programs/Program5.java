/*
 Develop a system to simulate a toll booth for collecting revenue. The system should:
1.	Allow the user to set toll rates for different vehicle types: Car, Truck, and Motorcycle.
2.	Accept the number of vehicles of each type passing through the toll booth.
3.	Calculate the total revenue based on the toll rates and number of vehicles.
4.	Display the total number of vehicles and the total revenue collected, in Indian Rupees (₹).
•	Toll Rate Examples:
o	Car: ₹50.00
o	Truck: ₹100.00
o	Motorcycle: ₹30.00
Define the class TollBoothRevenueManager with fields, an appropriate constructor, getter and setter methods, a toString method, and business logic methods. Define the class TollBoothRevenueManagerUtil with methods acceptRecord, printRecord, and menuList. Define the class Program with a main method to test the functionality of the utility class.


 */
package in.assignment5;
import java.util.Scanner;

class TollBoothRevenueManager{
	private float car;
	private float truck;
	private float motorcycle;	
	public TollBoothRevenueManager(){
		
	}
	
	public TollBoothRevenueManager(float car,float truck ,float motorcycle) {
		this.car = car;
		this.truck = truck;
		this.motorcycle = motorcycle;
	}
	
	public void setCar(float car) {
		this.car = car;
	}
	public float getCar() {
		return this.car;
	}
	public void settruck(float truck) {
		this.truck = truck;
	}
	public float gettruck() {
		return this.truck;
	}
	public void setmotorcycle(float motorcycle) {
		this.motorcycle = motorcycle;
	}
	public float getmotorcycle() {
		return this.motorcycle;
	}
}

class TollBoothRevenueManagerUtil{
	TollBoothRevenueManager t = new TollBoothRevenueManager();
	private int numberOfCars;
	private int numberOfTruck;
	private int numberOfMC;
	private float totalRevenue;
	private int totalVehicles;
	
	static Scanner sc = new Scanner(System.in);
	
	public void acceptRecord() {
		System.out.println("The number of vehicles of each type");
		System.out.println("Number of cars: ");
		numberOfCars = sc.nextInt();
		System.out.println("Number of trucks: ");
		numberOfTruck = sc.nextInt();
		System.out.println("Number of motorcycles: ");
		numberOfMC = sc.nextInt();
	}
	
	public void setTollRates() {
		System.out.println("Enter toll rates for different vehicle types: (Car, Truck, and Motorcycle): ");
		t.setCar(sc.nextFloat());
		t.settruck(sc.nextFloat());
		t.setmotorcycle(sc.nextFloat());
	}
	public void calculateRevenue() {
		this.totalVehicles = numberOfCars + numberOfTruck +numberOfMC;
		this.totalRevenue = (numberOfCars * t.getCar()) + (numberOfTruck * t.gettruck()) + (numberOfMC * t.getmotorcycle());
	}
	
	public String toString() {
		return "The total number of vehicles "+this.totalVehicles+" total Revenue "+this.totalRevenue;
	}
	
	public static int menuList() {
		System.out.println("0.Exit.");
		System.out.println("1.Accept Record.");
		System.out.println("2.Print Record.");
		System.out.print(" Enter choice	:	");
		int choice = sc.nextInt( );
		return choice;
	}

}
public class Program5 {

	public static void main(String[] args) {
		int choice;
		TollBoothRevenueManagerUtil t = new TollBoothRevenueManagerUtil();
		while (( choice = TollBoothRevenueManagerUtil.menuList()) != 0) {
			switch (choice) {
			case 1:
				t.acceptRecord();
				t.setTollRates();
				t.calculateRevenue();
				break;
			case 2:
				System.out.println(t);
				break;
			}
		}
	}

}

	
/*	
	static Scanner sc = new Scanner(System.in);
	
	public void acceptRecord() {
		System.out.println("The number of vehicles of each type");
		System.out.println("Number of cars: ");
		numberOfCars = sc.nextInt();
		System.out.println("Number of trucks: ");
		numberOfTruck = sc.nextInt();
		System.out.println("Number of motorcycles: ");
		numberOfMC = sc.nextInt();
	}
	
	public void setTollRates() {
		System.out.println("Enter toll rates for different vehicle types: (Car, Truck, and Motorcycle): ");
		this.car = sc.nextFloat();
		this.truck = sc.nextFloat();
		this.motorcycle = sc.nextFloat();
	}
	
	public void calculateRevenue() {
		this.totalVehicles = numberOfCars + numberOfTruck +numberOfMC;
		this.totalRevenue = (numberOfCars * car) + (numberOfTruck * truck) + (numberOfMC * motorcycle);
	}
	
	public void printRecord() {
		System.out.println("The total number of vehicles "+totalVehicles+" and the total revenue collected "+String.format("%.2f",totalRevenue )+" ₹");
	}
}
*/

