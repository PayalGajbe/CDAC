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
Define class TollBoothRevenueManager with methods acceptRecord, setTollRates, calculateRevenue & printRecord and test the functionality in main method.

 */

package in.assignment3;
import java.util.Scanner;


class TollBoothRevenueManager{
	private float car;
	private float truck;
	private float motorcycle;
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

public class Program5 {

	public static void main(String[] args) {
		TollBoothRevenueManager t = new TollBoothRevenueManager();
		t.acceptRecord();
		t.setTollRates();
		t.calculateRevenue();
		t.printRecord();
	}

}
