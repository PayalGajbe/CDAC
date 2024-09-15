package org.day5oops;
/*2)	Create a base class Vehicle with attributes like make and year. Provide a constructor in Vehicle to initialize these attributes. Derive a class Car that has an additional attribute model and write a constructor that initializes make, year, and model. Write a program to create a Car object and display its details.*/
class Vehicle{
	private long make;
	private int year;
	
	public Vehicle(long make, int year) {
		this.make = make;
		this.year = year;
	}
	public void printRecord() {
		System.out.println("make: "+make);
		System.out.println("year: "+year);
	}
	
	
}

class Car extends Vehicle{
	public String model;
	public Car(long make, int year, String model) {
		super(make, year);
		this.model = model;
	}
	@Override
	public void printRecord() {
		super.printRecord();
	    System.out.println("model: "+model);
	}
}


public class Day5p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car(4589614,2024,"hyundai");
		c.printRecord();
	}

}
