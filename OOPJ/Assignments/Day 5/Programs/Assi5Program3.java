package Assi5;

import java.util.Scanner;

/*
 3.	Design and implement a class named Employee to manage employee data for a company. The class should include fields to keep track of the total number of employees and the total salary expense, as well as individual employee details such as their ID, name, and salary.
The class should have methods to:
•	Retrieve the total number of employees (getTotalEmployees())
•	Apply a percentage raise to the salary of all employees (applyRaise(double percentage))
•	Calculate the total salary expense, including any raises (calculateTotalSalaryExpense())
•	Update the salary of an individual employee (updateSalary(double newSalary))
Understand the problem statement and use static and non-static fields and methods appropriately. Implement static and non-static initializers, constructors, getter and setter methods, and a toString() method to handle the initialization and representation of employee data.
Write a menu-driven program in the main method to test the functionalities.
 
 */

class Employee{
	private static int TotalEmployee = 0;
	private static double totalSalaryExpense = 0.0;
	private int Id;
	private String Name;
	private double Salary;
	static Scanner sc = new Scanner(System.in);
	
	public Employee() {
	
	}
	
	public Employee(int id, String name, double salary) {
		this.Id = id;
		this.Name = name;
		this.Salary = salary;
		TotalEmployee++;
		totalSalaryExpense += salary;
	}
	
	public void setId(int id) {
		this.Id = id;
	}
	public int getId() {
		return this.Id;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getName() {
		return this.Name;
	}
	public void setSalary(double salary) {
		totalSalaryExpense = totalSalaryExpense - this.Salary + salary;
		this.Salary = salary;
	}
	public double getSalary() {
		return this.Salary;
	}
	public static int getTotalEmployees() {
		return TotalEmployee;
	}
	
	public static double getTotalSalaryExpense() {
		return totalSalaryExpense;
	}
	public void applyRaise(double percentage) {
		double raise = this.Salary * (percentage/100);
		setSalary(this.Salary + raise);
	}
	public void acceptRecord() {
		System.out.println("Enter your id: ");
		setId(sc.nextInt());
		System.out.println("Enter your name: ");
		sc.next();
		setName(sc.nextLine());
		System.out.println("Enter your salary: ");
		setSalary(sc.nextDouble());
	}
	
	public String toString() {
		return "Employee[ID=" + Id + ", Name=" + Name + ", Salary=" + Salary + "]";
	}
	public static int menuList() {
		System.out.println("\nMenu");
		System.out.println("1. Add Employee ");
		System.out.println("2. Display total Employees: ");
		System.out.println("3. Display total salary expense: ");
		System.out.println("4. Display raise: ");
		System.out.println("5. Exit");	
		int choice = sc.nextInt();
		return choice;
	}
		
}

public class Assi5Program3 {

	public static void main(String[] args) {
		int choice;
		Employee emp = new Employee();
		while((choice = Employee.menuList()) != 5){
			switch (choice) {
			case 1:
				emp.acceptRecord();
				break;
			case 2:
				System.out.println(emp);
				break;
			case 3:
				Employee.getTotalEmployees();
				Employee.getTotalSalaryExpense();
				break;
			case 4:
				emp.applyRaise(50.00);
				emp.getSalary();
				break;

			}
		}
		
		

	}

}
