package Assi6p1;
/*7.	Declare a single-dimensional array as a field inside a class and instantiate it inside the class constructor. Define methods named acceptRecord and printRecord within the class and test their functionality.*/
import java.util.Scanner;
class Student{
	private String[] Name;
	static Scanner sc = new Scanner(System.in);
	public Student(int num) {
		Name = new String[num] ;
	}
	
	public void acceptRecord() {
		
		for(int index = 0; index < Name.length;index++) {
			System.out.println("Roll no: ");
			Name[index] = sc.nextLine();
		}
	}
	public void printRecord() {
		System.out.println("students are ");
		for(int index = 0;index<Name.length;index++) {
			System.out.println(Name[index]);
		}
	}
	
}

public class Program7 {

	public static void main(String[] args) {
		Student s = new Student(5);
		s.acceptRecord();
		s.printRecord();
		Student.sc.close();
	}

}
