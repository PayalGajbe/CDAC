package org.day5oops;
/*3)	Create a base class Animal with attributes like name, and methods like eat() and sleep(). Create a subclass Dog that inherits from Animal and has an additional method bark(). Write a program to demonstrate the use of inheritance by creating objects of Animal and Dog and calling their methods.
*/

class Animal{
	String Name;
	
	public Animal(String name) {
		this.Name = name;
	}
	
	public void eat() {
		System.out.println(Name+" is eating");
	}
	public void sleep() {
		System.out.println(Name+ " is sleeping");
	}
}

class Dog extends Animal{
	public Dog(String Name) {
		super(Name);
	}
	public void bark() {
		System.out.println(Name+" is barking");
	}
}

public class Day5p3 {

	public static void main(String[] args) {
		Animal animal = new Animal("Lion");
		animal.eat();
		animal.sleep();
		
		Dog dog = new Dog("Leo");
		dog.eat();
		dog.sleep();
		dog.bark();
		
		

	}

}
