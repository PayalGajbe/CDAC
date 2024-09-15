package org.day5oops;
/*4)	Build a class Student which contains details about the Student and compile and run its
instance.
*/

class Student{
	private String Name;
	private int Id;
	private int standard;
	private String division;
	
	public Student(String Name, int Id, int Standard, String division) {
		this.Name = Name;
		this.Id = Id;
		this.standard = Standard;
		this.division = division;
	}
	
	public String toString() {
		return String.format("%-10s%-5d%-5d%-5s", Name,Id,standard,division);
	}
}

public class Day5p4 {

	public static void main(String[] args) {
		Student s = new Student("Payal", 45, 9, "B");
		System.out.println(s);

	}

}
