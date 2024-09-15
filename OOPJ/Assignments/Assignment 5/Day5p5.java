package org.day5oops;
/*5)	Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine(). Create two subclasses Car and Motorcycle. Override the startEngine() and stopEngine() methods in each subclass to start and stop the engines differently.

*/
class Vehicle5{
	public void startEngine() {
		System.out.println("Engine starts....");
	}
	public void stopEngine() {
		System.out.println("Engine Stops....");
	}
}
class Car1 extends Vehicle5{
	@Override
	public void startEngine() {
		System.out.println("Car Engine Starts....");
	}
	public void stopEngine() {
		System.out.println("Car Engine Stops....");
	}
}
class Motorcycle extends Vehicle5{
	public void startEngine() {
		System.out.println("Motorcycle Engine Starts....");
	}
	public void stopEngine() {
		System.out.println("Motorcycle Engine Stops....");
	}
}

public class Day5p5 {

	public static void main(String[] args) {
		Car1 car = new Car1();
		car.stopEngine();
		Motorcycle motorcycle = new Motorcycle();
		motorcycle.stopEngine();

	}

}
